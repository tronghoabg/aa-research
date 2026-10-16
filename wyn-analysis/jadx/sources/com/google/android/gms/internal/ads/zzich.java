package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzich extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzica();
    zzicg zza;
    int zzb;
    int zzc;
    final zzicg zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzicc zzh;
    private zzice zzi;

    public zzich() {
        this(zze, true);
    }

    private final void zzf(zzicg zzicgVar, zzicg zzicgVar2) {
        zzicg zzicgVar3 = zzicgVar.zza;
        zzicgVar.zza = null;
        if (zzicgVar2 != null) {
            zzicgVar2.zza = zzicgVar3;
        }
        if (zzicgVar3 == null) {
            this.zza = zzicgVar2;
        } else if (zzicgVar3.zzb == zzicgVar) {
            zzicgVar3.zzb = zzicgVar2;
        } else {
            zzicgVar3.zzc = zzicgVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzg(com.google.android.gms.internal.ads.zzicg r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.zzicg r0 = r9.zzb
            com.google.android.gms.internal.ads.zzicg r1 = r9.zzc
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.zzi
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.zzi
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.zzicg r0 = r1.zzb
            com.google.android.gms.internal.ads.zzicg r3 = r1.zzc
            if (r3 == 0) goto L22
            int r3 = r3.zzi
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.zzi
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.zzi(r1)
            r8.zzh(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.zzh(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.android.gms.internal.ads.zzicg r1 = r0.zzb
            com.google.android.gms.internal.ads.zzicg r3 = r0.zzc
            if (r3 == 0) goto L4e
            int r3 = r3.zzi
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.zzi
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.zzh(r0)
            r8.zzi(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.zzi(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.zzi = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.zzi = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.zzicg r9 = r9.zza
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzich.zzg(com.google.android.gms.internal.ads.zzicg, boolean):void");
    }

    private final void zzh(zzicg zzicgVar) {
        zzicg zzicgVar2 = zzicgVar.zzb;
        zzicg zzicgVar3 = zzicgVar.zzc;
        zzicg zzicgVar4 = zzicgVar3.zzb;
        zzicg zzicgVar5 = zzicgVar3.zzc;
        zzicgVar.zzc = zzicgVar4;
        if (zzicgVar4 != null) {
            zzicgVar4.zza = zzicgVar;
        }
        zzf(zzicgVar, zzicgVar3);
        zzicgVar3.zzb = zzicgVar;
        zzicgVar.zza = zzicgVar3;
        int iMax = Math.max(zzicgVar2 != null ? zzicgVar2.zzi : 0, zzicgVar4 != null ? zzicgVar4.zzi : 0) + 1;
        zzicgVar.zzi = iMax;
        zzicgVar3.zzi = Math.max(iMax, zzicgVar5 != null ? zzicgVar5.zzi : 0) + 1;
    }

    private final void zzi(zzicg zzicgVar) {
        zzicg zzicgVar2 = zzicgVar.zzb;
        zzicg zzicgVar3 = zzicgVar.zzc;
        zzicg zzicgVar4 = zzicgVar2.zzb;
        zzicg zzicgVar5 = zzicgVar2.zzc;
        zzicgVar.zzb = zzicgVar5;
        if (zzicgVar5 != null) {
            zzicgVar5.zza = zzicgVar;
        }
        zzf(zzicgVar, zzicgVar2);
        zzicgVar2.zzc = zzicgVar;
        zzicgVar.zza = zzicgVar2;
        int iMax = Math.max(zzicgVar3 != null ? zzicgVar3.zzi : 0, zzicgVar5 != null ? zzicgVar5.zzi : 0) + 1;
        zzicgVar.zzi = iMax;
        zzicgVar2.zzi = Math.max(iMax, zzicgVar4 != null ? zzicgVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzicg zzicgVar = this.zzd;
        zzicgVar.zze = zzicgVar;
        zzicgVar.zzd = zzicgVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzicc zziccVar = this.zzh;
        if (zziccVar != null) {
            return zziccVar;
        }
        zzicc zziccVar2 = new zzicc(this);
        this.zzh = zziccVar2;
        return zziccVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzicg zzicgVarZzb = zzb(obj);
        if (zzicgVarZzb != null) {
            return zzicgVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzice zziceVar = this.zzi;
        if (zziceVar != null) {
            return zziceVar;
        }
        zzice zziceVar2 = new zzice(this);
        this.zzi = zziceVar2;
        return zziceVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzicg zzicgVarZza = zza(obj, true);
        Object obj3 = zzicgVarZza.zzh;
        zzicgVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzicg zzicgVarZze = zze(obj);
        if (zzicgVarZze != null) {
            return zzicgVarZze.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    public final zzicg zza(Object obj, boolean z2) {
        int iCompareTo;
        zzicg zzicgVar;
        Comparator comparator = this.zzf;
        zzicg zzicgVar2 = this.zza;
        if (zzicgVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzicgVar2.zzf) : comparator.compare(obj, zzicgVar2.zzf);
                if (iCompareTo == 0) {
                    return zzicgVar2;
                }
                zzicg zzicgVar3 = iCompareTo < 0 ? zzicgVar2.zzb : zzicgVar2.zzc;
                if (zzicgVar3 == null) {
                    break;
                }
                zzicgVar2 = zzicgVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i5 = iCompareTo;
        if (!z2) {
            return null;
        }
        zzicg zzicgVar4 = this.zzd;
        if (zzicgVar2 != null) {
            zzicg zzicgVar5 = zzicgVar2;
            zzicgVar = new zzicg(this.zzg, zzicgVar5, obj, zzicgVar4, zzicgVar4.zze);
            if (i5 < 0) {
                zzicgVar5.zzb = zzicgVar;
            } else {
                zzicgVar5.zzc = zzicgVar;
            }
            zzg(zzicgVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzicgVar = new zzicg(this.zzg, null, obj, zzicgVar4, zzicgVar4.zze);
            this.zza = zzicgVar;
        }
        this.zzb++;
        this.zzc++;
        return zzicgVar;
    }

    public final zzicg zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final zzicg zzc(Map.Entry entry) {
        zzicg zzicgVarZzb = zzb(entry.getKey());
        if (zzicgVarZzb == null || !Objects.equals(zzicgVarZzb.zzh, entry.getValue())) {
            return null;
        }
        return zzicgVarZzb;
    }

    public final void zzd(zzicg zzicgVar, boolean z2) {
        zzicg zzicgVar2;
        zzicg zzicgVar3;
        int i5;
        if (z2) {
            zzicg zzicgVar4 = zzicgVar.zze;
            zzicgVar4.zzd = zzicgVar.zzd;
            zzicgVar.zzd.zze = zzicgVar4;
        }
        zzicg zzicgVar5 = zzicgVar.zzb;
        zzicg zzicgVar6 = zzicgVar.zzc;
        zzicg zzicgVar7 = zzicgVar.zza;
        int i10 = 0;
        if (zzicgVar5 == null || zzicgVar6 == null) {
            if (zzicgVar5 != null) {
                zzf(zzicgVar, zzicgVar5);
                zzicgVar.zzb = null;
            } else if (zzicgVar6 != null) {
                zzf(zzicgVar, zzicgVar6);
                zzicgVar.zzc = null;
            } else {
                zzf(zzicgVar, null);
            }
            zzg(zzicgVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzicgVar5.zzi > zzicgVar6.zzi) {
            do {
                zzicgVar3 = zzicgVar5;
                zzicgVar5 = zzicgVar5.zzc;
            } while (zzicgVar5 != null);
        } else {
            do {
                zzicgVar2 = zzicgVar6;
                zzicgVar6 = zzicgVar6.zzb;
            } while (zzicgVar6 != null);
            zzicgVar3 = zzicgVar2;
        }
        zzd(zzicgVar3, false);
        zzicg zzicgVar8 = zzicgVar.zzb;
        if (zzicgVar8 != null) {
            i5 = zzicgVar8.zzi;
            zzicgVar3.zzb = zzicgVar8;
            zzicgVar8.zza = zzicgVar3;
            zzicgVar.zzb = null;
        } else {
            i5 = 0;
        }
        zzicg zzicgVar9 = zzicgVar.zzc;
        if (zzicgVar9 != null) {
            i10 = zzicgVar9.zzi;
            zzicgVar3.zzc = zzicgVar9;
            zzicgVar9.zza = zzicgVar3;
            zzicgVar.zzc = null;
        }
        zzicgVar3.zzi = Math.max(i5, i10) + 1;
        zzf(zzicgVar, zzicgVar3);
    }

    public final zzicg zze(Object obj) {
        zzicg zzicgVarZzb = zzb(obj);
        if (zzicgVarZzb != null) {
            zzd(zzicgVarZzb, true);
        }
        return zzicgVarZzb;
    }

    public zzich(Comparator comparator, boolean z2) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z2;
        this.zzd = new zzicg(z2);
    }

    public zzich(boolean z2) {
        this(zze, false);
    }
}
