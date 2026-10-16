package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.single.oa;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class yo {
    protected String lw;
    protected final oa moa;

    /* renamed from: oa, reason: collision with root package name */
    protected final gzw f25266oa;
    protected final Activity uef;
    protected String yo;

    public yo(Activity activity, gzw gzwVar, oa oaVar) {
        this.uef = activity;
        this.f25266oa = gzwVar;
        if (gzwVar != null) {
            this.yo = cp.gsd(gzwVar);
        }
        if (activity != null) {
            this.lw = String.valueOf(activity.hashCode());
        }
        this.moa = oaVar;
    }

    public void ab() {
    }

    public abstract int bcc();

    public void bs() {
    }

    public bcc cq() {
        return null;
    }

    public void cz() {
    }

    public bcc dj() {
        return null;
    }

    public lw dz() {
        return null;
    }

    public void ivm() {
    }

    public boolean lw() {
        return true;
    }

    public boolean moa() {
        return false;
    }

    public void oa() {
    }

    public abstract void oa(bcc bccVar, int i5);

    public abstract void oib();

    public abstract void sy();

    public void uef() {
    }

    public abstract void uef(int i5);

    public abstract boolean uef(bcc bccVar, int i5);

    public abstract List<gzw> wk();

    public abstract com.bytedance.sdk.openadsdk.component.reward.top.yo wrv();

    public void xs() {
    }

    public void yo() {
    }

    public abstract int zjm();

    public void oa(Activity activity) {
    }

    public void uef(float f10) {
    }

    public void uef(int i5, int i10) {
    }

    public void uef(Activity activity) {
    }

    public void uef(Bundle bundle) {
    }

    public void uef(View view) {
    }

    public void uef(View view, boolean z2) {
    }

    public void uef(bcc bccVar) {
    }

    public void uef(bcc bccVar, bcc bccVar2, oa.lw lwVar) {
    }

    public void uef(bcc bccVar, oa.lw lwVar) {
    }

    public void uef(bcc bccVar, boolean z2) {
    }

    public void uef(bcc bccVar, boolean z2, boolean z10, boolean z11, int i5) {
    }

    public void uef(uef uefVar, boolean z2) {
    }

    public void uef(Map<String, Object> map, bcc bccVar, float f10, float f11) {
    }

    public void uef(boolean z2) {
    }
}
