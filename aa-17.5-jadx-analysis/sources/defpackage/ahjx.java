package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahjx extends ahok implements ahph {
    private int bitField0_;
    private List<ahjn> type_ = Collections.EMPTY_LIST;
    private int firstNullable_ = -1;

    private ahjx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahjx create() {
        return new ahjx();
    }

    private void ensureTypeIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.type_ = new ArrayList(this.type_);
            this.bitField0_ |= 1;
        }
    }

    @Override // defpackage.ahpf
    public ahjy build() {
        ahjy ahjyVarBuildPartial = buildPartial();
        if (ahjyVarBuildPartial.isInitialized()) {
            return ahjyVarBuildPartial;
        }
        throw newUninitializedMessageException(ahjyVarBuildPartial);
    }

    public ahjy buildPartial() {
        ahjy ahjyVar = new ahjy(this, (ahgm) null);
        int i = this.bitField0_;
        if ((i & 1) == 1) {
            this.type_ = DesugarCollections.unmodifiableList(this.type_);
            this.bitField0_ &= -2;
        }
        ahjyVar.type_ = this.type_;
        int i2 = (i & 2) != 2 ? 0 : 1;
        ahjyVar.firstNullable_ = this.firstNullable_;
        ahjyVar.bitField0_ = i2;
        return ahjyVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahjx mo86clone() {
        ahjx ahjxVarCreate = create();
        ahjxVarCreate.mergeFrom(buildPartial());
        return ahjxVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahjy getDefaultInstanceForType() {
        return ahjy.getDefaultInstance();
    }

    public ahjn getType(int i) {
        return this.type_.get(i);
    }

    public int getTypeCount() {
        return this.type_.size();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        for (int i = 0; i < getTypeCount(); i++) {
            if (!getType(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public ahjx mergeFrom(ahjy ahjyVar) {
        if (ahjyVar == ahjy.getDefaultInstance()) {
            return this;
        }
        if (!ahjyVar.type_.isEmpty()) {
            if (this.type_.isEmpty()) {
                this.type_ = ahjyVar.type_;
                this.bitField0_ &= -2;
            } else {
                ensureTypeIsMutable();
                this.type_.addAll(ahjyVar.type_);
            }
        }
        if (ahjyVar.hasFirstNullable()) {
            setFirstNullable(ahjyVar.getFirstNullable());
        }
        setUnknownFields(getUnknownFields().concat(ahjyVar.unknownFields));
        return this;
    }

    public ahjx setFirstNullable(int i) {
        this.bitField0_ |= 2;
        this.firstNullable_ = i;
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
    public defpackage.ahjx mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahjy> r0 = defpackage.ahjy.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahjy r2 = (defpackage.ahjy) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahjy r3 = (defpackage.ahjy) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjx.mergeFrom(ahoc, ahog):ahjx");
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
        mergeFrom((ahjy) ahoqVar);
        return this;
    }
}
