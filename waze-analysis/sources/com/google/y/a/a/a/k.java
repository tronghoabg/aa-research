package com.google.y.a.a.a;

import androidx.media3.common.video.Frame;
import com.google.d.d.bn;
import com.google.d.d.cn;
import com.google.firebase.sessions.n;
import com.google.v.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class k {
    static final j a(InputStream inputStream, com.google.y.a.a.b.b bVar) {
        try {
            return b(inputStream, bVar);
        } finally {
            try {
                bVar.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final j b(InputStream inputStream, com.google.y.a.a.b.b bVar) throws e, a {
        try {
            com.google.y.a.a.b.a aVarD = bVar.d();
            if (aVarD == null) {
                throw new e("Parser being asked to parse an empty input stream");
            }
            try {
                byte bA = aVarD.a();
                byte b2 = aVarD.b();
                int i2 = 0;
                if (b2 == -128) {
                    long jA = bVar.a();
                    if (jA > 1000) {
                        throw new e("Parser being asked to read a large CBOR array");
                    }
                    c(bA, jA);
                    j[] jVarArr = new j[(int) jA];
                    while (i2 < jA) {
                        jVarArr[i2] = b(inputStream, bVar);
                        i2++;
                    }
                    return new b(bn.o(jVarArr));
                }
                if (b2 != -96) {
                    if (b2 == -64) {
                        throw new e("Tags are currently unsupported");
                    }
                    if (b2 == -32) {
                        return new c(bVar.f());
                    }
                    if (b2 == 0 || b2 == 32) {
                        long jB = bVar.b();
                        c(bA, jB > 0 ? jB : ~jB);
                        return new f(jB);
                    }
                    if (b2 == 64) {
                        byte[] bArrG = bVar.g();
                        c(bA, bArrG.length);
                        return new d(v.q(bArrG));
                    }
                    if (b2 == 96) {
                        String strE = bVar.e();
                        c(bA, strE.getBytes(StandardCharsets.UTF_8).length);
                        return new h(strE);
                    }
                    throw new e("Unidentifiable major type: " + aVarD.c());
                }
                long jC = bVar.c();
                if (jC > 1000) {
                    throw new e("Parser being asked to read a large CBOR map");
                }
                c(bA, jC);
                int i3 = (int) jC;
                n[] nVarArr = new n[i3];
                j jVar = null;
                int i4 = 0;
                while (i4 < jC) {
                    j jVarB = b(inputStream, bVar);
                    if (jVar != null && jVarB.compareTo(jVar) <= 0) {
                        try {
                            throw new a(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", jVar.toString(), jVarB.toString()));
                        } catch (RuntimeException e2) {
                            e = e2;
                            throw new e(e);
                        }
                    }
                    nVarArr[i4] = new n(jVarB, b(inputStream, bVar));
                    i4++;
                    jVar = jVarB;
                }
                TreeMap treeMap = new TreeMap();
                while (i2 < i3) {
                    n nVar = nVarArr[i2];
                    if (treeMap.containsKey(nVar.c())) {
                        throw new a("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(nVar.c(), nVar.d());
                    i2++;
                }
                return new g(cn.o(treeMap));
            } catch (IOException | RuntimeException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            throw new e(e4);
        }
    }

    private static final void c(byte b2, long j2) throws a {
        switch (b2) {
            case 24:
                if (j2 >= 24) {
                    return;
                }
                throw new a("Integer value " + j2 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j2 >= 256) {
                    return;
                }
                throw new a("Integer value " + j2 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j2 >= Frame.USAGE_VIDEO_ENCODE) {
                    return;
                }
                throw new a("Integer value " + j2 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j2 >= 4294967296L) {
                    return;
                }
                throw new a("Integer value " + j2 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
