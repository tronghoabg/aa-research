package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
class zzalw<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzamc zze;
    private Map<K, V> zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzalw<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzamc(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalw)) {
            return super.equals(obj);
        }
        zzalw zzalwVar = (zzalw) obj;
        int size = size();
        if (size != zzalwVar.size()) {
            return false;
        }
        int i5 = this.zzb;
        if (i5 != zzalwVar.zzb) {
            return entrySet().equals(zzalwVar.entrySet());
        }
        for (int i10 = 0; i10 < i5; i10++) {
            if (!zza(i10).equals(zzalwVar.zza(i10))) {
                return false;
            }
        }
        if (i5 != size) {
            return this.zzc.equals(zzalwVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza((zzalw<K, V>) comparable);
        return iZza >= 0 ? (V) ((zzama) this.zza[iZza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i5 = this.zzb;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            iHashCode += this.zza[i10].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + iHashCode : iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzalw<K, V>) obj, (Comparable) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza((zzalw<K, V>) comparable);
        if (iZza >= 0) {
            return zzb(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb;
    }

    private zzalw() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.EMPTY_SET : this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzc() {
        return new zzamb(this);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(K r5) {
        /*
            r4 = this;
            int r0 = r4.zzb
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1f
            java.lang.Object[] r2 = r4.zza
            r2 = r2[r1]
            com.google.android.gms.internal.firebase-auth-api.zzama r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzama) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1c
            int r0 = r0 + 1
        L1a:
            int r5 = -r0
            return r5
        L1c:
            if (r2 != 0) goto L1f
            return r1
        L1f:
            r0 = 0
        L20:
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.zza
            r3 = r3[r2]
            com.google.android.gms.internal.firebase-auth-api.zzama r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzama) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L20
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L20
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalw.zza(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i5) {
        zzg();
        V v2 = (V) ((zzama) this.zza[i5]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i5 + 1, objArr, i5, (this.zzb - i5) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzama(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v2;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k, V v2) {
        zzg();
        int iZza = zza((zzalw<K, V>) k);
        if (iZza >= 0) {
            return (V) ((zzama) this.zza[iZza]).setValue(v2);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i5 = -(iZza + 1);
        if (i5 >= 16) {
            return zzf().put(k, v2);
        }
        int i10 = this.zzb;
        if (i10 == 16) {
            zzama zzamaVar = (zzama) this.zza[15];
            this.zzb = i10 - 1;
            zzf().put((Comparable) zzamaVar.getKey(), zzamaVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i5, objArr, i5 + 1, (objArr.length - i5) - 1);
        this.zza[i5] = new zzama(this, k, v2);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i5) {
        if (i5 < this.zzb) {
            return (zzama) this.zza[i5];
        }
        throw new ArrayIndexOutOfBoundsException(i5);
    }
}
