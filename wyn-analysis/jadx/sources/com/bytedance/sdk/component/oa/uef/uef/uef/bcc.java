package com.bytedance.sdk.component.oa.uef.uef.uef;

import android.text.TextUtils;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.wk;
import com.bytedance.sdk.component.oa.uef.wrv;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class bcc extends dz {

    /* renamed from: oa, reason: collision with root package name */
    public static int f25065oa = -2;
    public static int uef = -1;
    String ivm;
    final int lw;
    wrv moa;
    String xs;
    HttpURLConnection yo;

    public bcc(HttpURLConnection httpURLConnection, wrv wrvVar, int i5) {
        this.yo = httpURLConnection;
        this.moa = wrvVar;
        this.lw = i5;
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public com.bytedance.sdk.component.oa.uef.zjm bcc() {
        if (zjm() == null || zjm().f25073oa == null) {
            return null;
        }
        return new com.bytedance.sdk.component.oa.uef.zjm(zjm().f25073oa);
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ivm().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public String cz() {
        return this.xs;
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public wk ivm() {
        cz czVar;
        com.bytedance.sdk.component.yo.uef.uef uefVar;
        com.bytedance.sdk.component.yo.uef.uef uefVar2;
        wrv wrvVar = this.moa;
        if (wrvVar != null && (uefVar2 = wrvVar.f25073oa) != null) {
            uefVar2.dj();
        }
        try {
            try {
                czVar = new cz(this.yo);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.yo;
                czVar = new cz(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th) {
            th.getMessage();
            czVar = null;
        }
        wrv wrvVar2 = this.moa;
        if (wrvVar2 != null && (uefVar = wrvVar2.f25073oa) != null) {
            uefVar.cq();
        }
        return czVar;
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public String lw() throws IOException {
        return !TextUtils.isEmpty(this.ivm) ? this.ivm : this.yo.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public boolean moa() {
        int i5 = this.lw;
        return i5 >= 200 && i5 < 300;
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public long oa() {
        return 0L;
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public long uef() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public com.bytedance.sdk.component.oa.uef.ivm xs() {
        if (this.yo == null) {
            return new com.bytedance.sdk.component.oa.uef.ivm(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.yo.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || yo() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.oa.uef.ivm((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.oa.uef.dz
    public int yo() {
        return this.lw;
    }

    public wrv zjm() {
        return this.moa;
    }

    public void uef(String str) {
        this.xs = str;
    }

    public bcc(int i5, String str, wrv wrvVar) {
        this.ivm = str;
        this.moa = wrvVar;
        this.lw = i5;
    }

    public bcc(int i5, String str, wrv wrvVar, String str2) {
        this.ivm = str;
        this.moa = wrvVar;
        this.lw = i5;
        this.xs = str2;
    }
}
