package Debo;

interface Converter
{
   Object convert(Object obj);
}

abstract class TemperatureConverter implements Converter
{
    
    abstract protected boolean isHot(double temp);
}


class Thermometer extends TemperatureConverter
{
    public Object convert(Object obj1)
    {
        double c = (double) obj1;
        return  (c*(9/5))+32;
    }
    protected boolean isHot(double temp)
    {
        boolean bool;
        if(temp>100.4)
        {
            bool=true;
        }
        else
        {
            bool=false;
        }
        return bool;
    }
}  
class Thermocouple extends TemperatureConverter
{

  public Object convert(Object obj2)
    {
        double c = (double) obj2;
       return (c + 273.15);
    }
    protected boolean isHot(double temp)
    {
        boolean bool;
         if(temp>310)
        {
            bool=true;
        }
        else
        {
            bool=false;
        }
        return bool;
    }
}

abstract class SpeedConverter implements Converter
{
    abstract protected boolean isFast(double speed);
}

class PitotTube extends SpeedConverter
{
   public Object convert(Object obj1)
   {
    double kms = (double) obj1;
    return  (2.94118 * kms);
    
   }
   protected boolean isFast(double speed)
    {
        boolean bool;
        if(speed>1000)
        {
            bool=true;
        }
        else
        {
            bool=false;
        }
        return bool;
    }
}
class ShaftLog extends SpeedConverter
{
    public Object convert(Object obj2)
    {
    double kmh = (double) obj2;
     return (0.6214 * kmh);
    }
    
    protected boolean isFast(double speed) {
        boolean bool;
        if (speed > 100) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}


