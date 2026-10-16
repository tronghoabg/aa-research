package com.bytedance.adsdk.oa.moa;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.oa.wrv;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class bcc {

    /* renamed from: oa, reason: collision with root package name */
    private final ivm f24568oa;
    private final xs uef;

    public bcc(xs xsVar, ivm ivmVar) {
        this.uef = xsVar;
        this.f24568oa = ivmVar;
    }

    private com.bytedance.adsdk.oa.xs oa(Context context, String str, String str2) {
        xs xsVar;
        Pair<yo, InputStream> pairUef;
        if (str2 == null || (xsVar = this.uef) == null || (pairUef = xsVar.uef(str)) == null) {
            return null;
        }
        yo yoVar = (yo) pairUef.first;
        InputStream inputStream = (InputStream) pairUef.second;
        wrv<com.bytedance.adsdk.oa.xs> wrvVarUef = yoVar == yo.ZIP ? com.bytedance.adsdk.oa.bcc.uef(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.oa.bcc.oa(inputStream, str2);
        if (wrvVarUef.uef() != null) {
            return wrvVarUef.uef();
        }
        return null;
    }

    private wrv<com.bytedance.adsdk.oa.xs> yo(Context context, String str, String str2) throws IOException {
        Closeable closeable = null;
        try {
            try {
                moa moaVarUef = this.f24568oa.uef(str);
                if (!moaVarUef.uef()) {
                    wrv<com.bytedance.adsdk.oa.xs> wrvVar = new wrv<>(new IllegalArgumentException(moaVarUef.moa()));
                    try {
                        moaVarUef.close();
                    } catch (IOException unused) {
                    }
                    return wrvVar;
                }
                wrv<com.bytedance.adsdk.oa.xs> wrvVarUef = uef(context, str, moaVarUef.oa(), moaVarUef.yo(), str2);
                wrvVarUef.uef();
                try {
                    moaVarUef.close();
                } catch (IOException unused2) {
                }
                return wrvVarUef;
            } finally {
            }
        } catch (Exception e7) {
            wrv<com.bytedance.adsdk.oa.xs> wrvVar2 = new wrv<>(e7);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException unused3) {
                }
            }
            return wrvVar2;
        }
    }

    public wrv<com.bytedance.adsdk.oa.xs> uef(Context context, String str, String str2) {
        com.bytedance.adsdk.oa.xs xsVarOa = oa(context, str, str2);
        return xsVarOa != null ? new wrv<>(xsVarOa) : yo(context, str, str2);
    }

    private wrv<com.bytedance.adsdk.oa.xs> uef(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        wrv<com.bytedance.adsdk.oa.xs> wrvVarUef;
        yo yoVar;
        xs xsVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            yoVar = yo.JSON;
            wrvVarUef = uef(str, inputStream, str3);
        } else {
            yo yoVar2 = yo.ZIP;
            wrvVarUef = uef(context, str, inputStream, str3);
            yoVar = yoVar2;
        }
        if (str3 != null && wrvVarUef.uef() != null && (xsVar = this.uef) != null) {
            xsVar.uef(str, yoVar);
        }
        return wrvVarUef;
    }

    private wrv<com.bytedance.adsdk.oa.xs> uef(Context context, String str, InputStream inputStream, String str2) throws IOException {
        xs xsVar;
        if (str2 != null && (xsVar = this.uef) != null) {
            return com.bytedance.adsdk.oa.bcc.uef(context, new ZipInputStream(new FileInputStream(xsVar.uef(str, inputStream, yo.ZIP))), str);
        }
        return com.bytedance.adsdk.oa.bcc.uef(context, new ZipInputStream(inputStream), (String) null);
    }

    private wrv<com.bytedance.adsdk.oa.xs> uef(String str, InputStream inputStream, String str2) throws IOException {
        xs xsVar;
        if (str2 != null && (xsVar = this.uef) != null) {
            return com.bytedance.adsdk.oa.bcc.oa(new FileInputStream(xsVar.uef(str, inputStream, yo.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.oa.bcc.oa(inputStream, (String) null);
    }
}
