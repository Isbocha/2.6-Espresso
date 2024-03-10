package ru.kkuzmichev.simpleappforespresso;

public class EspressoIdlingResources {

    private static final String RESOURCE = "GLOBAL";
   public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURCE);

    public static void increment() {
        idlingResource.increment();
    }

    public static void decrement() {
        if (!idlingResource.isIdleNow()) {
            idlingResource.decrement();
        }
    }

    public static IdlingResource getIdlingResource() {
        return idlingResource;
    }

}


