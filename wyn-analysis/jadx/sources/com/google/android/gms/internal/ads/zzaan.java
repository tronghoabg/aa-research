package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaan extends zzbl {
    public static final zzaan zzJ = new zzaan(new zzaam());
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final boolean zzY;
    private final SparseArray zzZ;
    private final SparseBooleanArray zzaa;

    static {
        String str = zzfm.zza;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(BackupConstant.SCENE_BACKUP_RENDER_FAIL, 36);
        Integer.toString(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, 36);
        Integer.toString(1004, 36);
        Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1010, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1011, 36);
        Integer.toString(TTAdConstant.IMAGE_MODE_1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public /* synthetic */ zzaan(zzaam zzaamVar, byte[] bArr) {
        this(zzaamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaan.class == obj.getClass()) {
            zzaan zzaanVar = (zzaan) obj;
            if (super.equals(zzaanVar) && this.zzK == zzaanVar.zzK && this.zzM == zzaanVar.zzM && this.zzO == zzaanVar.zzO && this.zzT == zzaanVar.zzT && this.zzU == zzaanVar.zzU && this.zzV == zzaanVar.zzV && this.zzX == zzaanVar.zzX) {
                SparseBooleanArray sparseBooleanArray = this.zzaa;
                SparseBooleanArray sparseBooleanArray2 = zzaanVar.zzaa;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            SparseArray sparseArray = this.zzZ;
                            SparseArray sparseArray2 = zzaanVar.zzZ;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i10);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzzo zzzoVar = (zzzo) entry.getKey();
                                                if (!map2.containsKey(zzzoVar) || !Objects.equals(entry.getValue(), map2.get(zzzoVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i5)) < 0) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzK ? 1 : 0)) * 961) + (this.zzM ? 1 : 0)) * 961) + (this.zzO ? 1 : 0)) * 28629151) + (this.zzT ? 1 : 0)) * 31) + (this.zzU ? 1 : 0)) * 31) + (this.zzV ? 1 : 0)) * 961) + (this.zzX ? 1 : 0)) * 31;
    }

    public final boolean zza(int i5) {
        return this.zzaa.get(i5);
    }

    @Deprecated
    public final boolean zzb(int i5, zzzo zzzoVar) {
        Map map = (Map) this.zzZ.get(i5);
        return map != null && map.containsKey(zzzoVar);
    }

    @Deprecated
    public final zzaao zzc(int i5, zzzo zzzoVar) {
        Map map = (Map) this.zzZ.get(i5);
        if (map != null) {
            return (zzaao) map.get(zzzoVar);
        }
        return null;
    }

    public final zzaam zzd() {
        return new zzaam(this, null);
    }

    public final /* synthetic */ SparseArray zze() {
        return this.zzZ;
    }

    public final /* synthetic */ SparseBooleanArray zzf() {
        return this.zzaa;
    }

    private zzaan(zzaam zzaamVar) {
        super(zzaamVar);
        this.zzK = zzaamVar.zzz();
        this.zzL = false;
        this.zzM = zzaamVar.zzA();
        this.zzN = false;
        this.zzO = zzaamVar.zzB();
        this.zzP = false;
        this.zzQ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzT = zzaamVar.zzC();
        this.zzU = zzaamVar.zzD();
        this.zzV = zzaamVar.zzE();
        this.zzW = false;
        this.zzX = zzaamVar.zzF();
        this.zzY = false;
        this.zzZ = zzaamVar.zzG();
        this.zzaa = zzaamVar.zzH();
    }
}
