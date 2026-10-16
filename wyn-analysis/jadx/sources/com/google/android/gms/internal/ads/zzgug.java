package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzgug {
    private final zzgtf zza;
    private final boolean zzb;
    private final zzguf zzc;

    private zzgug(zzguf zzgufVar, boolean z2, zzgtf zzgtfVar, int i5) {
        this.zzc = zzgufVar;
        this.zzb = z2;
        this.zza = zzgtfVar;
    }

    public static zzgug zza(final zzgtf zzgtfVar) {
        return new zzgug(new zzguf() { // from class: com.google.android.gms.internal.ads.zzgud
            @Override // com.google.android.gms.internal.ads.zzguf
            public final /* synthetic */ Iterator zza(zzgug zzgugVar, CharSequence charSequence) {
                return new zzgtx(zzgugVar, charSequence, zzgtfVar);
            }
        });
    }

    public static zzgug zzb(Pattern pattern) {
        final zzgtk zzgtkVar = new zzgtk(pattern);
        zzgtr.zzf(!((zzgtj) zzgtkVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgtkVar);
        return new zzgug(new zzguf() { // from class: com.google.android.gms.internal.ads.zzgub
            @Override // com.google.android.gms.internal.ads.zzguf
            public final /* synthetic */ Iterator zza(zzgug zzgugVar, CharSequence charSequence) {
                return new zzgty(zzgugVar, charSequence, zzgtkVar.zza(charSequence));
            }
        });
    }

    public static zzgug zzc(int i5) {
        final int i10 = 4000;
        return new zzgug(new zzguf(i10) { // from class: com.google.android.gms.internal.ads.zzguc
            @Override // com.google.android.gms.internal.ads.zzguf
            public final /* synthetic */ Iterator zza(zzgug zzgugVar, CharSequence charSequence) {
                return new zzgtz(zzgugVar, charSequence, 4000);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final Iterator zzh(CharSequence charSequence) {
        return this.zzc.zza(this, charSequence);
    }

    public final zzgug zzd() {
        return new zzgug(this.zzc, true, this.zza, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final zzgug zze(zzgtf zzgtfVar) {
        zzgtfVar.getClass();
        return new zzgug(this.zzc, this.zzb, zzgtfVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final Iterable zzf(CharSequence charSequence) {
        charSequence.getClass();
        return new zzgua(this, charSequence);
    }

    public final List zzg(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzh = zzh(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzh.hasNext()) {
            arrayList.add((String) itZzh.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final /* synthetic */ zzgtf zzi() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzj() {
        return this.zzb;
    }

    private zzgug(zzguf zzgufVar) {
        this(zzgufVar, false, zzgtd.zza, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }
}
