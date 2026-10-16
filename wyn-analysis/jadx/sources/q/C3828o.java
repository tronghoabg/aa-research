package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import i.AbstractC2820a;
import java.util.HashMap;

/* renamed from: q.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3828o {

    /* renamed from: a, reason: collision with root package name */
    public Object f43844a = null;

    /* renamed from: b, reason: collision with root package name */
    public Object f43845b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43846c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43847d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43848e;

    /* renamed from: f, reason: collision with root package name */
    public Object f43849f;

    public /* synthetic */ C3828o(TextView textView) {
        this.f43849f = textView;
    }

    public static HashMap d(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put(JsonStorageKeyNames.DATA_KEY, bArr);
        return map;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f43849f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f43846c || this.f43847d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f43846c) {
                    drawableMutate.setTintList((ColorStateList) this.f43844a);
                }
                if (this.f43847d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f43845b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        C3826n c3826n = (C3826n) this.f43849f;
        Drawable checkMarkDrawable = c3826n.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f43846c || this.f43847d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f43846c) {
                    drawableMutate.setTintList((ColorStateList) this.f43844a);
                }
                if (this.f43847d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f43845b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c3826n.getDrawableState());
                }
                c3826n.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i5) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f43849f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC2820a.f36449m;
        md.J jS = md.J.s(context, attributeSet, iArr, i5, 0);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        k1.S.l(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) jS.f40581b, i5);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(Fe.g.B(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(Fe.g.B(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(jS.m(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC3827n0.c(typedArray.getInt(3, -1), null));
            }
            jS.v();
        } catch (Throwable th) {
            jS.v();
            throw th;
        }
    }
}
