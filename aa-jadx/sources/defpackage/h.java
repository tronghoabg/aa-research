package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private static final int[] a = {0, 4, 8};
    private static final android.util.SparseIntArray b;
    private final java.util.HashMap c = new java.util.HashMap();

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        b = sparseIntArray;
        int[] iArr = defpackage.i.a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    private static int i(android.content.res.TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final defpackage.g a(int i) {
        java.util.HashMap map = this.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new defpackage.g());
        }
        return (defpackage.g) map.get(numValueOf);
    }

    public final void b(android.support.constraint.ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.c = null;
    }

    public final void c(android.support.constraint.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap map = this.c;
        java.util.HashSet<java.lang.Integer> hashSet = new java.util.HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(childAt.getId());
            if (map.containsKey(numValueOf)) {
                hashSet.remove(numValueOf);
                defpackage.g gVar = (defpackage.g) map.get(numValueOf);
                defpackage.f fVar = (defpackage.f) childAt.getLayoutParams();
                gVar.a(fVar);
                childAt.setLayoutParams(fVar);
                childAt.setVisibility(gVar.G);
                childAt.setAlpha(gVar.R);
                childAt.setRotationX(gVar.U);
                childAt.setRotationY(gVar.V);
                childAt.setScaleX(gVar.W);
                childAt.setScaleY(gVar.X);
                childAt.setPivotX(gVar.Y);
                childAt.setPivotY(gVar.Z);
                childAt.setTranslationX(gVar.aa);
                childAt.setTranslationY(gVar.ab);
                childAt.setTranslationZ(gVar.ac);
                if (gVar.S) {
                    childAt.setElevation(gVar.T);
                }
            }
        }
        for (java.lang.Integer num : hashSet) {
            defpackage.g gVar2 = (defpackage.g) map.get(num);
            if (gVar2.a) {
                android.support.constraint.Guideline guideline = new android.support.constraint.Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                defpackage.f fVar2 = new defpackage.f();
                gVar2.a(fVar2);
                constraintLayout.addView(guideline, fVar2);
            }
        }
    }

    public final void d(int i, int i2) {
        java.util.HashMap map = this.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            defpackage.g gVar = (defpackage.g) map.get(numValueOf);
            if (i2 != 3) {
                gVar.n = -1;
                gVar.o = -1;
                gVar.D = -1;
                gVar.K = -1;
                return;
            }
            gVar.m = -1;
            gVar.l = -1;
            gVar.C = -1;
            gVar.I = -1;
        }
    }

    public final void e(android.support.constraint.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap map = this.c;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            defpackage.f fVar = (defpackage.f) childAt.getLayoutParams();
            int id = childAt.getId();
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                map.put(numValueOf, new defpackage.g());
            }
            defpackage.g gVar = (defpackage.g) map.get(numValueOf);
            gVar.d = id;
            gVar.h = fVar.d;
            gVar.i = fVar.e;
            gVar.j = fVar.f;
            gVar.k = fVar.g;
            gVar.l = fVar.h;
            gVar.m = fVar.i;
            gVar.n = fVar.j;
            gVar.o = fVar.k;
            gVar.p = fVar.l;
            gVar.q = fVar.m;
            gVar.r = fVar.n;
            gVar.s = fVar.o;
            gVar.t = fVar.p;
            gVar.u = fVar.w;
            gVar.v = fVar.x;
            gVar.w = fVar.y;
            gVar.x = fVar.K;
            gVar.y = fVar.L;
            gVar.z = fVar.M;
            gVar.g = fVar.c;
            gVar.e = fVar.a;
            gVar.f = fVar.b;
            gVar.b = fVar.width;
            gVar.c = fVar.height;
            gVar.A = fVar.leftMargin;
            gVar.B = fVar.rightMargin;
            gVar.C = fVar.topMargin;
            gVar.D = fVar.bottomMargin;
            gVar.N = fVar.B;
            gVar.O = fVar.A;
            gVar.Q = fVar.D;
            gVar.P = fVar.C;
            gVar.ad = fVar.E;
            gVar.ae = fVar.F;
            gVar.af = fVar.I;
            gVar.ag = fVar.J;
            gVar.ah = fVar.G;
            gVar.ai = fVar.H;
            gVar.E = fVar.getMarginEnd();
            gVar.F = fVar.getMarginStart();
            gVar.G = childAt.getVisibility();
            gVar.R = childAt.getAlpha();
            gVar.U = childAt.getRotationX();
            gVar.V = childAt.getRotationY();
            gVar.W = childAt.getScaleX();
            gVar.X = childAt.getScaleY();
            gVar.Y = childAt.getPivotX();
            gVar.Z = childAt.getPivotY();
            gVar.aa = childAt.getTranslationX();
            gVar.ab = childAt.getTranslationY();
            gVar.ac = childAt.getTranslationZ();
            if (gVar.S) {
                gVar.T = childAt.getElevation();
            }
        }
    }

    public final void f(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                    defpackage.g gVar = new defpackage.g();
                    android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, defpackage.i.b);
                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = typedArrayObtainStyledAttributes.getIndex(i2);
                        android.util.SparseIntArray sparseIntArray = b;
                        int i3 = sparseIntArray.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    gVar.p = i(typedArrayObtainStyledAttributes, index, gVar.p);
                                    break;
                                case 2:
                                    gVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.D);
                                    break;
                                case 3:
                                    gVar.o = i(typedArrayObtainStyledAttributes, index, gVar.o);
                                    break;
                                case 4:
                                    gVar.n = i(typedArrayObtainStyledAttributes, index, gVar.n);
                                    break;
                                case 5:
                                    gVar.w = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    gVar.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gVar.x);
                                    break;
                                case 7:
                                    gVar.y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gVar.y);
                                    break;
                                case 8:
                                    gVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.E);
                                    break;
                                case 9:
                                    gVar.n = i(typedArrayObtainStyledAttributes, index, gVar.t);
                                    break;
                                case 10:
                                    gVar.s = i(typedArrayObtainStyledAttributes, index, gVar.s);
                                    break;
                                case 11:
                                    gVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.K);
                                    break;
                                case 12:
                                    gVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.L);
                                    break;
                                case 13:
                                    gVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.H);
                                    break;
                                case 14:
                                    gVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.J);
                                    break;
                                case 15:
                                    gVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.M);
                                    break;
                                case 16:
                                    gVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.I);
                                    break;
                                case 17:
                                    gVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gVar.e);
                                    break;
                                case 18:
                                    gVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, gVar.f);
                                    break;
                                case 19:
                                    gVar.g = typedArrayObtainStyledAttributes.getFloat(index, gVar.g);
                                    break;
                                case 20:
                                    gVar.u = typedArrayObtainStyledAttributes.getFloat(index, gVar.u);
                                    break;
                                case 21:
                                    gVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, gVar.c);
                                    break;
                                case 22:
                                    int i4 = typedArrayObtainStyledAttributes.getInt(index, gVar.G);
                                    gVar.G = i4;
                                    gVar.G = a[i4];
                                    break;
                                case 23:
                                    gVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, gVar.b);
                                    break;
                                case 24:
                                    gVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.A);
                                    break;
                                case 25:
                                    gVar.h = i(typedArrayObtainStyledAttributes, index, gVar.h);
                                    break;
                                case 26:
                                    gVar.i = i(typedArrayObtainStyledAttributes, index, gVar.i);
                                    break;
                                case 27:
                                    gVar.z = typedArrayObtainStyledAttributes.getInt(index, gVar.z);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                    gVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.B);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                    gVar.j = i(typedArrayObtainStyledAttributes, index, gVar.j);
                                    break;
                                case 30:
                                    gVar.k = i(typedArrayObtainStyledAttributes, index, gVar.k);
                                    break;
                                case 31:
                                    gVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.F);
                                    break;
                                case 32:
                                    gVar.q = i(typedArrayObtainStyledAttributes, index, gVar.q);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                    gVar.r = i(typedArrayObtainStyledAttributes, index, gVar.r);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                    gVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.C);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                    gVar.m = i(typedArrayObtainStyledAttributes, index, gVar.m);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                    gVar.l = i(typedArrayObtainStyledAttributes, index, gVar.l);
                                    break;
                                case 37:
                                    gVar.v = typedArrayObtainStyledAttributes.getFloat(index, gVar.v);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                    gVar.d = typedArrayObtainStyledAttributes.getResourceId(index, gVar.d);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                    gVar.O = typedArrayObtainStyledAttributes.getFloat(index, gVar.O);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                    gVar.N = typedArrayObtainStyledAttributes.getFloat(index, gVar.N);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                    gVar.P = typedArrayObtainStyledAttributes.getInt(index, gVar.P);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                    gVar.Q = typedArrayObtainStyledAttributes.getInt(index, gVar.Q);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                    gVar.R = typedArrayObtainStyledAttributes.getFloat(index, gVar.R);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                    gVar.S = true;
                                    gVar.T = typedArrayObtainStyledAttributes.getFloat(index, gVar.T);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                    gVar.U = typedArrayObtainStyledAttributes.getFloat(index, gVar.U);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                    gVar.V = typedArrayObtainStyledAttributes.getFloat(index, gVar.V);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                    gVar.W = typedArrayObtainStyledAttributes.getFloat(index, gVar.W);
                                    break;
                                case 48:
                                    gVar.X = typedArrayObtainStyledAttributes.getFloat(index, gVar.X);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                    gVar.Y = typedArrayObtainStyledAttributes.getFloat(index, gVar.Y);
                                    break;
                                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                    gVar.Z = typedArrayObtainStyledAttributes.getFloat(index, gVar.Z);
                                    break;
                                case 51:
                                    gVar.aa = typedArrayObtainStyledAttributes.getFloat(index, gVar.aa);
                                    break;
                                case 52:
                                    gVar.ab = typedArrayObtainStyledAttributes.getFloat(index, gVar.ab);
                                    break;
                                case 53:
                                    gVar.ac = typedArrayObtainStyledAttributes.getFloat(index, gVar.ac);
                                    break;
                                default:
                                    android.util.Log.w("ConstraintSet", "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        } else {
                            android.util.Log.w("ConstraintSet", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        gVar.a = true;
                    }
                    this.c.put(java.lang.Integer.valueOf(gVar.d), gVar);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void g(int i, int i2, int i3) {
        java.util.HashMap map = this.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new defpackage.g());
        }
        defpackage.g gVar = (defpackage.g) map.get(numValueOf);
        if (i2 != 3) {
            gVar.o = i3;
            gVar.n = -1;
            gVar.p = -1;
        } else {
            gVar.m = i3;
            gVar.l = -1;
            gVar.p = -1;
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        java.util.HashMap map = this.c;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new defpackage.g());
        }
        defpackage.g gVar = (defpackage.g) map.get(numValueOf);
        if (i2 != 3) {
            if (i4 == 4) {
                gVar.o = i3;
                gVar.n = -1;
                gVar.p = -1;
            } else {
                gVar.n = i3;
                gVar.o = -1;
                gVar.p = -1;
            }
            gVar.D = 0;
            return;
        }
        if (i4 == 3) {
            gVar.l = i3;
            gVar.m = -1;
            gVar.p = -1;
        } else {
            gVar.m = i3;
            gVar.l = -1;
            gVar.p = -1;
        }
        gVar.C = 0;
    }
}
