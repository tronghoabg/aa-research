package com.bytedance.sdk.component.lw.oa.yo.uef;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class oa implements com.bytedance.sdk.component.lw.oa, Cloneable {
    private static volatile com.bytedance.sdk.component.lw.oa cz;
    private File bcc;
    private boolean ivm;
    private boolean lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25031oa;
    private long uef;
    private boolean xs;
    private int yo;

    public oa(int i5, int i10, int i11, long j8, File file) {
        this(i5, i10, i11, j8, i10 != 0, j8 != 0, file);
    }

    public static com.bytedance.sdk.component.lw.oa cz() {
        return cz;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public File bcc() {
        return this.bcc;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public boolean ivm() {
        return this.xs;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public boolean lw() {
        return this.lw;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public int moa() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public int oa() {
        return this.f25031oa;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public long uef() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public boolean xs() {
        return this.ivm;
    }

    @Override // com.bytedance.sdk.component.lw.oa
    public int yo() {
        return this.yo;
    }

    public oa(int i5, int i10, int i11, long j8, boolean z2, boolean z10, File file) {
        this.uef = j8;
        this.f25031oa = i5;
        this.yo = i10;
        this.moa = i11;
        this.lw = z2;
        this.ivm = z10;
        this.bcc = file;
        this.xs = i11 != 0;
    }

    public static void uef(Context context, com.bytedance.sdk.component.lw.oa oaVar) {
        if (oaVar != null) {
            cz = oaVar;
        } else {
            cz = uef(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.lw.oa uef(File file) {
        long jUef;
        int iYo;
        int iMoa;
        file.mkdirs();
        if (cz == null) {
            iYo = 10;
            iMoa = 14;
            jUef = 20;
        } else {
            jUef = cz.uef();
            iYo = cz.yo();
            iMoa = cz.moa();
        }
        return new oa(0, iYo, iMoa, jUef, file);
    }
}
