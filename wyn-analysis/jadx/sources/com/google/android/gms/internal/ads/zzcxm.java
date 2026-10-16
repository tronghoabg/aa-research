package com.google.android.gms.internal.ads;

import D6.C0392q;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcxm extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxm(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxm zza(Context context, View view, zzfkn zzfknVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxm zzcxmVar = new zzcxm(context);
        List list = zzfknVar.zzu;
        if (!list.isEmpty() && (resources = zzcxmVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((zzfko) list.get(0)).zza;
            float f11 = displayMetrics.density;
            zzcxmVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r4.zzb * f11)));
        }
        zzcxmVar.zzb = view;
        zzcxmVar.addView(view);
        C6.n nVar = C6.n.f1857D;
        zzcgl zzcglVar = nVar.f1860C;
        zzcgl.zzb(zzcxmVar, zzcxmVar);
        zzcgl zzcglVar2 = nVar.f1860C;
        zzcgl.zza(zzcxmVar, zzcxmVar);
        JSONObject jSONObject = zzfknVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxmVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcxmVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcxmVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcxmVar.addView(relativeLayout);
        return zzcxmVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i5) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i5);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d3) {
        H6.f fVar = C0392q.f2477g.f2478a;
        return H6.f.b(this.zza, (int) d3);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
