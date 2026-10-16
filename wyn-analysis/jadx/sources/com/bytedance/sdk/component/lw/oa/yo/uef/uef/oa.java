package com.bytedance.sdk.component.lw.oa.yo.uef.uef;

import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.lw.yo;
import com.bytedance.sdk.component.utils.zjm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class oa implements yo {

    /* renamed from: oa, reason: collision with root package name */
    private uef f25035oa;
    private int uef;

    public oa(File file, long j8) {
        int i5 = (int) j8;
        this.uef = i5;
        this.f25035oa = uef.uef(i5, file);
    }

    @Override // com.bytedance.sdk.component.lw.uef
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public boolean oa(String str) throws IOException {
        try {
            InputStream inputStreamUef = this.f25035oa.uef(str);
            boolean z2 = inputStreamUef != null;
            zjm.uef(inputStreamUef);
            return z2;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                zjm.uef(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.lw.uef
    /* renamed from: oa, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] uef(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStreamUef;
        uef uefVar = this.f25035oa;
        if (uefVar != null && str != null) {
            try {
                inputStreamUef = uefVar.uef(str);
                if (inputStreamUef != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                            while (true) {
                                int i5 = inputStreamUef.read(bArr);
                                if (i5 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i5);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            zjm.uef(inputStreamUef);
                            zjm.uef(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        zjm.uef(inputStreamUef);
                        zjm.uef(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    zjm.uef(inputStreamUef);
                    zjm.uef(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamUef = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStreamUef = null;
            }
            zjm.uef(inputStreamUef);
            zjm.uef(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.lw.yo
    public InputStream uef(String str) {
        uef uefVar = this.f25035oa;
        if (uefVar == null) {
            return null;
        }
        return uefVar.uef(str);
    }

    @Override // com.bytedance.sdk.component.lw.uef
    public boolean uef(String str, byte[] bArr) {
        uef uefVar = this.f25035oa;
        if (uefVar == null || bArr == null || str == null) {
            return false;
        }
        return uefVar.uef(str, bArr);
    }
}
