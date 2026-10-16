package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class h {
    private static final int[] a = {0, 4, 8};
    private static final SparseIntArray b;
    private final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        int[] iArr = i.a;
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
        sparseIntArray.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    private static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final g a(int i) {
        HashMap map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new g());
        }
        return (g) map.get(numValueOf);
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.c = null;
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.c;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            Integer numValueOf = Integer.valueOf(childAt.getId());
            if (map.containsKey(numValueOf)) {
                hashSet.remove(numValueOf);
                g gVar = (g) map.get(numValueOf);
                f fVar = (f) childAt.getLayoutParams();
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
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            g gVar2 = (g) map.get(num);
            if (gVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                f fVar2 = new f();
                gVar2.a(fVar2);
                constraintLayout.addView(guideline, fVar2);
            }
        }
    }

    public final void d(int i, int i2) {
        HashMap map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            g gVar = (g) map.get(numValueOf);
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

    public final void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.c;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            f fVar = (f) childAt.getLayoutParams();
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                map.put(numValueOf, new g());
            }
            g gVar = (g) map.get(numValueOf);
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

    public final void f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    g gVar = new g();
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, i.b);
                    int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = typedArrayObtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = b;
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
                                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                    gVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.B);
                                    break;
                                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
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
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                    gVar.r = i(typedArrayObtainStyledAttributes, index, gVar.r);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                    gVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, gVar.C);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                    gVar.m = i(typedArrayObtainStyledAttributes, index, gVar.m);
                                    break;
                                case Maneuver.TYPE_STRAIGHT /* 36 */:
                                    gVar.l = i(typedArrayObtainStyledAttributes, index, gVar.l);
                                    break;
                                case 37:
                                    gVar.v = typedArrayObtainStyledAttributes.getFloat(index, gVar.v);
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                    gVar.d = typedArrayObtainStyledAttributes.getResourceId(index, gVar.d);
                                    break;
                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                    gVar.O = typedArrayObtainStyledAttributes.getFloat(index, gVar.O);
                                    break;
                                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                    gVar.N = typedArrayObtainStyledAttributes.getFloat(index, gVar.N);
                                    break;
                                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                    gVar.P = typedArrayObtainStyledAttributes.getInt(index, gVar.P);
                                    break;
                                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                    gVar.Q = typedArrayObtainStyledAttributes.getInt(index, gVar.Q);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                    gVar.R = typedArrayObtainStyledAttributes.getFloat(index, gVar.R);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                    gVar.S = true;
                                    gVar.T = typedArrayObtainStyledAttributes.getFloat(index, gVar.T);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                    gVar.U = typedArrayObtainStyledAttributes.getFloat(index, gVar.U);
                                    break;
                                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                    gVar.V = typedArrayObtainStyledAttributes.getFloat(index, gVar.V);
                                    break;
                                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                    gVar.W = typedArrayObtainStyledAttributes.getFloat(index, gVar.W);
                                    break;
                                case 48:
                                    gVar.X = typedArrayObtainStyledAttributes.getFloat(index, gVar.X);
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                    gVar.Y = typedArrayObtainStyledAttributes.getFloat(index, gVar.Y);
                                    break;
                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
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
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        } else {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        gVar.a = true;
                    }
                    this.c.put(Integer.valueOf(gVar.d), gVar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void g(int i, int i2, int i3) {
        HashMap map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new g());
        }
        g gVar = (g) map.get(numValueOf);
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
        HashMap map = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new g());
        }
        g gVar = (g) map.get(numValueOf);
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
