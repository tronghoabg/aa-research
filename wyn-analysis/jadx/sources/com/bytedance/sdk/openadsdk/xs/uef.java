package com.bytedance.sdk.openadsdk.xs;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.oa.uef.cq;
import com.bytedance.sdk.component.oa.uef.cz;
import com.bytedance.sdk.component.oa.uef.dj;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.ivm;
import com.bytedance.sdk.component.oa.uef.lw;
import com.bytedance.sdk.component.oa.uef.wrv;
import com.bytedance.sdk.component.oa.uef.yo;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class uef implements INetWork {

    /* renamed from: oa, reason: collision with root package name */
    protected dj f26195oa;
    protected dj uef;

    public uef() {
        dj.uef uefVar = new dj.uef();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.uef = uefVar.uef(10L, timeUnit).oa(10L, timeUnit).yo(10L, timeUnit).uef();
        this.f26195oa = new dj.uef().uef(10L, timeUnit).oa(30L, timeUnit).yo(30L, timeUnit).uef();
    }

    private Map<String, String> uef(ivm ivmVar) {
        if (ivmVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < ivmVar.uef(); i5++) {
            map.put(ivmVar.uef(i5), ivmVar.oa(i5));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        dz dzVarOa = this.uef.uef(new wrv.uef().uef().oa(str).uef("gecko").oa()).oa();
        return new Response(uef(dzVarOa.xs()), dzVarOa.yo() == 200 ? dzVarOa.ivm().oa() : null, dzVarOa.yo(), dzVarOa.lw());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        lw.uef uefVar = new lw.uef();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                uefVar.uef((String) pair.first, (String) pair.second);
            }
        }
        dz dzVarOa = this.uef.uef(new wrv.uef().oa(str).uef((cq) uefVar.uef()).uef("gecko").oa()).oa();
        return new Response(uef(dzVarOa.xs()), dzVarOa.yo() == 200 ? dzVarOa.ivm().oa() : null, dzVarOa.yo(), dzVarOa.lw());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j8, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e7;
        Closeable closeable;
        BufferedInputStream bufferedInputStream;
        Closeable closeable2 = null;
        int i5 = 0;
        try {
            try {
                try {
                    dz dzVarOa = this.f26195oa.uef(new wrv.uef().uef().uef("gecko").oa(str).oa()).oa();
                    int iYo = dzVarOa.yo();
                    try {
                        bufferedInputStream = new BufferedInputStream(dzVarOa.ivm().yo());
                    } catch (Exception e10) {
                        e7 = e10;
                    }
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int i10 = bufferedInputStream.read(bArr, 0, 2048);
                            if (i10 == -1) {
                                CloseableUtils.close(bufferedInputStream);
                                return;
                            }
                            bufferOutputStream.write(bArr, 0, i10);
                        }
                    } catch (Exception e11) {
                        e7 = e11;
                        i5 = iYo;
                        throw new RuntimeException("downloadFile failed, code: " + i5 + ", url:" + str + ", caused by:" + e7.getMessage(), e7);
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e12) {
                e7 = e12;
            }
        } catch (Throwable th2) {
            th = th2;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.uef.uef(new wrv.uef().uef().oa(str).uef("gecko").oa()).uef(new yo() { // from class: com.bytedance.sdk.openadsdk.xs.uef.1
            @Override // com.bytedance.sdk.component.oa.uef.yo
            public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, dz dzVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.oa.uef.yo
            public void uef(com.bytedance.sdk.component.oa.uef.oa oaVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        dz dzVarOa = this.uef.uef(new wrv.uef().oa(str).uef(cq.uef(cz.uef("application/json; charset=utf-8"), str2)).uef("gecko").oa()).oa();
        return new Response(uef(dzVarOa.xs()), dzVarOa.yo() == 200 ? dzVarOa.ivm().oa() : null, dzVarOa.yo(), dzVarOa.lw());
    }
}
