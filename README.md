# OrderedArrayList

We discussed where to check method signatures for the add and set methods. We then discussed if we  used T or E in the method signature and we agreed that we should be using T since that's how the type works. We also discussed how we need to use super.add(element).

 I got a "Note: Tester.java uses unchecked or unsafe operations." error and discussed with them that it was because I didn't use <String> when initializing. We then discussed if we can just do "return super.add(element)" and we agreed that return performs the method itself.

 I got a NullPointerException error and I realized we should use element == null not element.equals(null).
