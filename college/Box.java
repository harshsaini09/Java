// An example class to understand need of
// constructor overloading.
class Box
{
    double width, height,depth;

    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}