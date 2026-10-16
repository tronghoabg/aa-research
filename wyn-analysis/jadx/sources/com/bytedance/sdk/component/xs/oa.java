package com.bytedance.sdk.component.xs;

import com.bytedance.sdk.component.oa.uef.zjm;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class oa {
    private final boolean cz;
    final long ivm;
    final long lw;
    final String moa;

    /* renamed from: oa, reason: collision with root package name */
    final String f25106oa;
    final int uef;
    zjm xs;
    final Map<String, String> yo;
    private File bcc = null;
    private byte[] zjm = null;

    public oa(boolean z2, int i5, String str, Map<String, String> map, String str2, long j8, long j10) {
        this.cz = z2;
        this.uef = i5;
        this.f25106oa = str;
        this.yo = map;
        this.moa = str2;
        this.lw = j8;
        this.ivm = j10;
    }

    public boolean ivm() {
        return this.cz;
    }

    public File lw() {
        return this.bcc;
    }

    public String moa() {
        return this.moa;
    }

    public String oa() {
        return this.f25106oa;
    }

    public int uef() {
        return this.uef;
    }

    public zjm xs() {
        return this.xs;
    }

    public Map<String, String> yo() {
        return this.yo;
    }

    public void uef(File file) {
        this.bcc = file;
    }

    public void uef(byte[] bArr) {
        this.zjm = bArr;
    }

    public void uef(zjm zjmVar) {
        this.xs = zjmVar;
    }
}
