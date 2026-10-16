package com.bytedance.sdk.openadsdk.core.yo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm.cz;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.gb;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class uef extends oa {
    private int km;
    private WeakReference<InterfaceC0112uef> lz;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25833oa;
    private boolean oyt;
    private boolean uef;
    private boolean yo;

    /* renamed from: com.bytedance.sdk.openadsdk.core.yo.uef$uef, reason: collision with other inner class name */
    public interface InterfaceC0112uef {
        long getVideoProgress();
    }

    public uef(Context context, gzw gzwVar, String str, int i5) {
        super(context, gzwVar, str, i5);
        this.uef = true;
        this.f25833oa = false;
        this.yo = false;
        this.oyt = false;
    }

    private boolean bcc() {
        return this instanceof cz;
    }

    private boolean cz() {
        gzw gzwVar = ((oa) this).ivm;
        if (gzwVar == null || bcc()) {
            return false;
        }
        if (gzwVar.hw() != 5 && gzwVar.hw() != 15) {
            return false;
        }
        if (this.km == 0) {
            this.km = gzwVar.dqw();
        }
        oa();
        uef();
        yo();
        if (this.km == 5 && xs() && uef() && !oa() && !yo()) {
            return false;
        }
        int i5 = this.km;
        return i5 == 1 || i5 == 2 || i5 == 5;
    }

    private boolean moa(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.wk.oa.ivm) || view.getId() == bs.wp || view.getId() == bs.rl || view.getId() == bs.swd || view.getId() == bs.gem || view.getId() == bs.cop || view.getId() == 520093726 || view.getId() == bs.az) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i5 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i5 >= viewGroup.getChildCount()) {
                    break;
                }
                if (moa(viewGroup.getChildAt(i5))) {
                    return true;
                }
                i5++;
            }
        }
        return false;
    }

    private boolean xs() {
        gzw gzwVar = ((oa) this).ivm;
        return gzw.lw(gzwVar) && gzwVar.vj() == 1;
    }

    public boolean oa() {
        return false;
    }

    public void uef(boolean z2) {
        this.uef = z2;
    }

    public boolean yo() {
        return false;
    }

    public void oa(boolean z2) {
        this.f25833oa = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(android.view.View r27, float r28, float r29, float r30, float r31, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.yo.yo.uef> r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.yo.uef.uef(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    public void yo(boolean z2) {
        this.yo = z2;
    }

    private String oa(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void moa(boolean z2) {
        this.oyt = z2;
    }

    public boolean uef() {
        gzw gzwVar = ((oa) this).ivm;
        if (gzwVar == null) {
            return true;
        }
        int iOa = sy.moa().oa(gzwVar.jnk());
        int iYo = com.bytedance.sdk.component.utils.sy.yo(sy.uef());
        if (iOa == 1) {
            return gb.moa(iYo);
        }
        if (iOa == 2) {
            return gb.lw(iYo) || gb.moa(iYo) || gb.ivm(iYo);
        }
        if (iOa != 3) {
            return iOa != 5 || gb.moa(iYo) || gb.ivm(iYo);
        }
        return false;
    }

    public void uef(InterfaceC0112uef interfaceC0112uef) {
        this.lz = new WeakReference<>(interfaceC0112uef);
    }

    public void uef(View view) {
        uef(view, this.dhk, this.tpx, this.orq, this.gzw, this.dxx, this.ku);
    }
}
