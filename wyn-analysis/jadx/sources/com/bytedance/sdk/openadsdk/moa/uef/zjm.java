package com.bytedance.sdk.openadsdk.moa.uef;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class zjm {
    public static zjm uef = new zjm();
    private volatile boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private uef f26003oa;
    private final Map<String, uef> yo = new HashMap();

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        private final int f26004oa;
        private final int uef;

        public uef(int i5, int i10) {
            this.uef = (i5 < 0 || i5 > 5) ? 3 : i5;
            this.f26004oa = i10 < 10 ? 30 : i10;
        }

        public int oa() {
            return this.f26004oa;
        }

        public int uef() {
            return this.uef;
        }
    }

    private int oa() {
        uef uefVar = this.f26003oa;
        if (uefVar != null) {
            return uefVar.uef();
        }
        return 3;
    }

    private int yo() {
        uef uefVar = this.f26003oa;
        if (uefVar != null) {
            return uefVar.oa();
        }
        return 30;
    }

    public void uef(uef uefVar) {
        this.f26003oa = uefVar;
    }

    public void uef(String str, uef uefVar) {
        if (TextUtils.isEmpty(str) || uefVar == null) {
            return;
        }
        this.yo.put(str, uefVar);
    }

    public int oa(String str) {
        uef uefVar = this.yo.get(str);
        if (uefVar == null) {
            return yo();
        }
        return uefVar.oa();
    }

    public int uef(String str) {
        if (!uef()) {
            return 4;
        }
        uef uefVar = this.yo.get(str);
        if (uefVar == null) {
            return oa();
        }
        return uefVar.uef();
    }

    public boolean uef() {
        return this.moa;
    }

    public void uef(boolean z2) {
        this.moa = z2;
    }
}
