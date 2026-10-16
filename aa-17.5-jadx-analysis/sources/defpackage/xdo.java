package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class xdo {
    public int a;
    public String b;
    public int c;
    public int[] d;
    public Drawable e;
    public int f;
    public int g;
    public Drawable h;
    public boolean i;
    public int j;
    public String k;
    public char[] l;
    public ColorStateList m;
    public int n;
    public Typeface o;
    public int p;

    public xdo(Context context, XmlResourceParser xmlResourceParser, int i, int i2, int i3, int i4) {
        this.a = -1;
        this.b = "";
        this.d = new int[]{0};
        this.n = 24;
        Resources resources = context.getResources();
        this.f = i;
        this.g = i2;
        this.c = i3;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        yph yphVar = xdp.a;
        ((ype) yphVar.l().ai((char) 10136)).u("Begin parsing Key attributes.");
        for (int i5 = 0; i5 < attributeSetAsAttributeSet.getAttributeCount(); i5++) {
            String attributeName = attributeSetAsAttributeSet.getAttributeName(i5);
            if ("keyLabel".equals(attributeName)) {
                String attributeValue = attributeSetAsAttributeSet.getAttributeValue(i5);
                this.b = attributeValue;
                if (attributeValue.isEmpty()) {
                    ((ype) yphVar.l().ai((char) 10140)).u("Parsed keyLabel is empty.");
                } else {
                    ((ype) yphVar.l().ai(10139)).y("Parsed keyLabel: %s", this.b);
                }
            } else if ("codes".equals(attributeName)) {
                String attributeValue2 = attributeSetAsAttributeSet.getAttributeValue(i5);
                if (attributeValue2.charAt(0) == '@') {
                    this.d[0] = resources.getInteger(attributeSetAsAttributeSet.getAttributeResourceValue(i5, 0));
                } else {
                    List listI = xxx.c(',').i(attributeValue2);
                    this.d = new int[listI.size()];
                    for (int i6 = 0; i6 < listI.size(); i6++) {
                        this.d[i6] = Integer.parseInt((String) listI.get(i6));
                    }
                }
                if (this.d.length > 0) {
                    ((ype) yphVar.l().ai(10138)).w("Parsed keyCode identifier: %d", this.d[0]);
                }
                int[] iArr = this.d;
                if (iArr.length > 0 && iArr[0] == -4) {
                    this.p = i4;
                    int i7 = i4 & 255;
                    if (i7 == 2) {
                        this.e = context.getDrawable(R.drawable.ic_gearhead_projection_keyboard_go);
                    } else if (i7 == 4) {
                        this.e = context.getDrawable(R.drawable.ic_gearhead_projection_keyboard_send);
                    } else if (i7 == 5) {
                        this.e = context.getDrawable(R.drawable.ic_gearhead_projection_keyboard_next);
                    } else if (i7 == 6) {
                        this.e = context.getDrawable(R.drawable.ic_gearhead_projection_keyboard_done);
                    } else if (i7 != 7) {
                        this.e = context.getDrawable(R.drawable.ic_gearhead_projection_keyboard_search);
                    } else {
                        this.e = context.getDrawable(R.drawable.ic_gearhead_projection_keyboard_previous);
                    }
                }
            } else if ("keyCustomUpperCase".equals(attributeName)) {
                this.k = attributeSetAsAttributeSet.getAttributeValue(i5);
            } else if ("keyIcon".equals(attributeName)) {
                this.e = context.getDrawable(attributeSetAsAttributeSet.getAttributeResourceValue(i5, 0));
            } else if ("keyBackground".equals(attributeName)) {
                int attributeResourceValue = attributeSetAsAttributeSet.getAttributeResourceValue(i5, 0);
                this.h = context.getDrawable(attributeResourceValue);
                if (attributeResourceValue == R.drawable.gearhead_rectangle_round_corner_focus_background) {
                    this.i = true;
                }
            } else if ("keyHeight".equals(attributeName)) {
                this.f = resources.getDimensionPixelOffset(attributeSetAsAttributeSet.getAttributeResourceValue(i5, 0));
            } else if ("keyWidth".equals(attributeName)) {
                this.g = resources.getDimensionPixelOffset(attributeSetAsAttributeSet.getAttributeResourceValue(i5, 0));
            } else if ("keySpan".equals(attributeName)) {
                this.c = resources.getInteger(attributeSetAsAttributeSet.getAttributeResourceValue(i5, 0));
            } else if ("id".equals(attributeName)) {
                this.a = attributeSetAsAttributeSet.getAttributeResourceValue(i5, -1);
            } else if ("keyPopupCharacters".equals(attributeName)) {
                this.l = resources.getString(attributeSetAsAttributeSet.getAttributeResourceValue(i5, 0)).toCharArray();
            } else {
                tss.q("GH.ProjectionKeyboard", "Unhandled attribute of key in the layout xml: %s", attributeName);
            }
        }
        ((ype) yphVar.l().ai((char) 10137)).u("Finished parsing Key attributes.");
        int[] iArr2 = this.d;
        if (iArr2.length > 0 && iArr2[0] == 92) {
            this.b = "\\";
        }
        if (iArr2[0] == 0) {
            if (this.b.isEmpty()) {
                tss.q("GH.ProjectionKeyboard", "Key has no label or code", new Object[0]);
            } else {
                this.d[0] = this.b.charAt(0);
            }
        }
        if (this.a == -1) {
            tss.q("GH.ProjectionKeyboard", "Key has invalid id. keyCode: %s", Integer.valueOf(this.d[0]));
        }
        if (this.h == null) {
            int iMax = Math.max((this.f - this.g) / 2, 0);
            int iMax2 = Math.max((this.g - this.f) / 2, 0);
            this.h = new InsetDrawable(context.getDrawable(R.drawable.gearhead_oval_focus_background), iMax2, iMax, iMax2, iMax);
        }
        f();
    }

    public static xdo b(xdo xdoVar, Character ch) {
        xdo xdoVar2 = new xdo(xdoVar);
        if (ch == null) {
            xdoVar2.d[0] = -21;
            return xdoVar2;
        }
        xdoVar2.b = Character.toString(ch.charValue());
        xdoVar2.d[0] = ch.charValue();
        xdoVar2.f();
        return xdoVar2;
    }

    private final void f() {
        if (this.e == null) {
            this.j = (this.b.isEmpty() || !Character.isLetter(this.b.charAt(0))) ? R.style.TextAppearance_Gearhead_KeyTextSecondary : R.style.TextAppearance_Gearhead_KeyTextPrimary;
        }
    }

    public final int a() {
        return this.d[0];
    }

    public final boolean c() {
        return a() == -4;
    }

    public final boolean d() {
        return a() == -9;
    }

    public final boolean e() {
        return a() == -2;
    }

    public xdo(xdo xdoVar) {
        this.a = -1;
        this.b = "";
        this.d = new int[]{0};
        this.n = 24;
        this.a = xdoVar.a;
        this.b = xdoVar.b;
        this.c = xdoVar.c;
        int length = xdoVar.d.length;
        int[] iArr = new int[length];
        this.d = iArr;
        System.arraycopy(xdoVar.d, 0, iArr, 0, length);
        this.e = xdoVar.e;
        this.f = xdoVar.f;
        this.g = xdoVar.g;
        this.h = xdoVar.h;
        this.j = xdoVar.j;
        this.k = xdoVar.k;
        this.l = xdoVar.l;
        this.m = xdoVar.m;
        this.n = xdoVar.n;
        this.o = xdoVar.o;
        this.p = xdoVar.p;
    }
}
