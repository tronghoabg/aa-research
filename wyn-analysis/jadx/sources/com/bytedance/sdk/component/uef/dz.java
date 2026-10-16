package com.bytedance.sdk.component.uef;

import android.text.TextUtils;
import wg.b;

/* loaded from: classes.dex */
public class dz {
    public final String bcc;
    public final String ivm;
    public final String lw;
    public final String moa;

    /* renamed from: oa, reason: collision with root package name */
    public final String f25084oa;
    public final int uef;
    public final String xs;
    public final String yo;

    public static final class uef {
        private String ivm;
        private String lw;
        private String moa;

        /* renamed from: oa, reason: collision with root package name */
        private String f25085oa;
        private String uef;
        private String xs;
        private String yo;

        private uef() {
        }

        public uef ivm(String str) {
            this.ivm = str;
            return this;
        }

        public uef lw(String str) {
            this.lw = str;
            return this;
        }

        public uef moa(String str) {
            this.moa = str;
            return this;
        }

        public uef oa(String str) {
            this.f25085oa = str;
            return this;
        }

        public uef uef(String str) {
            this.uef = str;
            return this;
        }

        public uef xs(String str) {
            this.xs = str;
            return this;
        }

        public uef yo(String str) {
            this.yo = str;
            return this;
        }

        public dz uef() {
            return new dz(this);
        }
    }

    public static uef uef() {
        return new uef();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("methodName: ");
        sb2.append(this.moa);
        sb2.append(", params: ");
        sb2.append(this.lw);
        sb2.append(", callbackId: ");
        sb2.append(this.ivm);
        sb2.append(", type: ");
        sb2.append(this.yo);
        sb2.append(", version: ");
        return b.c(sb2, this.f25084oa, ", ");
    }

    private dz(String str, int i5) {
        this.f25084oa = null;
        this.yo = null;
        this.moa = null;
        this.lw = null;
        this.ivm = str;
        this.xs = null;
        this.uef = i5;
        this.bcc = null;
    }

    public static dz uef(String str, int i5) {
        return new dz(str, i5);
    }

    public static boolean uef(dz dzVar) {
        return dzVar == null || dzVar.uef != 1 || TextUtils.isEmpty(dzVar.moa) || TextUtils.isEmpty(dzVar.lw);
    }

    private dz(uef uefVar) {
        this.f25084oa = uefVar.uef;
        this.yo = uefVar.f25085oa;
        this.moa = uefVar.yo;
        this.lw = uefVar.moa;
        this.ivm = uefVar.lw;
        this.xs = uefVar.ivm;
        this.uef = 1;
        this.bcc = uefVar.xs;
    }
}
