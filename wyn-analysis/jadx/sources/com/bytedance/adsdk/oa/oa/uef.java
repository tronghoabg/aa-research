package com.bytedance.adsdk.oa.oa;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.oa.yo;
import com.bytedance.adsdk.oa.yo.xs;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class uef {
    private yo lw;
    private final AssetManager moa;
    private final xs<String> uef = new xs<>();

    /* renamed from: oa, reason: collision with root package name */
    private final Map<xs<String>, Typeface> f24572oa = new HashMap();
    private final Map<String, Typeface> yo = new HashMap();
    private String ivm = ".ttf";

    public uef(Drawable.Callback callback, yo yoVar) {
        this.lw = yoVar;
        if (callback instanceof View) {
            this.moa = ((View) callback).getContext().getAssets();
        } else {
            this.moa = null;
        }
    }

    private Typeface oa(com.bytedance.adsdk.oa.yo.yo yoVar) {
        Typeface typefaceCreateFromAsset;
        String strUef = yoVar.uef();
        Typeface typeface = this.yo.get(strUef);
        if (typeface != null) {
            return typeface;
        }
        String strYo = yoVar.yo();
        String strOa = yoVar.oa();
        yo yoVar2 = this.lw;
        if (yoVar2 != null) {
            typefaceCreateFromAsset = yoVar2.uef(strUef, strYo, strOa);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.lw.uef(strUef);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        yo yoVar3 = this.lw;
        if (yoVar3 != null && typefaceCreateFromAsset == null) {
            String strOa2 = yoVar3.oa(strUef, strYo, strOa);
            if (strOa2 == null) {
                strOa2 = this.lw.oa(strUef);
            }
            if (strOa2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.moa, strOa2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (yoVar.moa() != null) {
            return yoVar.moa();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.moa, "fonts/" + strUef + this.ivm);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.yo.put(strUef, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void uef(yo yoVar) {
        this.lw = yoVar;
    }

    public void uef(String str) {
        this.ivm = str;
    }

    public Typeface uef(com.bytedance.adsdk.oa.yo.yo yoVar) {
        this.uef.uef(yoVar.uef(), yoVar.yo());
        Typeface typeface = this.f24572oa.get(this.uef);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceUef = uef(oa(yoVar), yoVar.yo());
        this.f24572oa.put(this.uef, typefaceUef);
        return typefaceUef;
    }

    private Typeface uef(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i5 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i5 ? typeface : Typeface.create(typeface, i5);
    }
}
