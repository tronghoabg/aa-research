package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahhk extends ahok implements ahph {
    private int bitField0_;
    private List<ahhu> effect_ = Collections.EMPTY_LIST;

    private ahhk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahhk create() {
        return new ahhk();
    }

    private void ensureEffectIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.effect_ = new ArrayList(this.effect_);
            this.bitField0_ |= 1;
        }
    }

    @Override // defpackage.ahpf
    public ahhl build() {
        ahhl ahhlVarBuildPartial = buildPartial();
        if (ahhlVarBuildPartial.isInitialized()) {
            return ahhlVarBuildPartial;
        }
        throw newUninitializedMessageException(ahhlVarBuildPartial);
    }

    public ahhl buildPartial() {
        ahhl ahhlVar = new ahhl(this, (ahgm) null);
        if ((this.bitField0_ & 1) == 1) {
            this.effect_ = DesugarCollections.unmodifiableList(this.effect_);
            this.bitField0_ &= -2;
        }
        ahhlVar.effect_ = this.effect_;
        return ahhlVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahhk mo86clone() {
        ahhk ahhkVarCreate = create();
        ahhkVarCreate.mergeFrom(buildPartial());
        return ahhkVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahhl getDefaultInstanceForType() {
        return ahhl.getDefaultInstance();
    }

    public ahhu getEffect(int i) {
        return this.effect_.get(i);
    }

    public int getEffectCount() {
        return this.effect_.size();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getEffectCount(); i++) {
            if (!getEffect(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public ahhk mergeFrom(ahhl ahhlVar) {
        if (ahhlVar == ahhl.getDefaultInstance()) {
            return this;
        }
        if (!ahhlVar.effect_.isEmpty()) {
            if (this.effect_.isEmpty()) {
                this.effect_ = ahhlVar.effect_;
                this.bitField0_ &= -2;
            } else {
                ensureEffectIsMutable();
                this.effect_.addAll(ahhlVar.effect_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahhlVar.unknownFields));
        return this;
    }

    private void maybeForceBuilderInitialization() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    @Override // defpackage.ahns, defpackage.ahpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ahhk mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahhl> r0 = defpackage.ahhl.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahhl r2 = (defpackage.ahhl) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            if (r2 == 0) goto Ld
            r1.mergeFrom(r2)
        Ld:
            return r1
        Le:
            r2 = move-exception
            goto L1a
        L10:
            r2 = move-exception
            ahpg r3 = r2.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Le
            ahhl r3 = (defpackage.ahhl) r3     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> L18
        L18:
            r2 = move-exception
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L20
            r1.mergeFrom(r3)
        L20:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhk.mergeFrom(ahoc, ahog):ahhk");
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahns mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahns, defpackage.ahpf
    public /* bridge */ /* synthetic */ ahpf mergeFrom(ahoc ahocVar, ahog ahogVar) throws Throwable {
        mergeFrom(ahocVar, ahogVar);
        return this;
    }

    @Override // defpackage.ahok
    public /* bridge */ /* synthetic */ ahok mergeFrom(ahoq ahoqVar) {
        mergeFrom((ahhl) ahoqVar);
        return this;
    }
}
