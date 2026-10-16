package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahgw extends ahok implements ahph {
    private List<ahgv> argument_ = Collections.EMPTY_LIST;
    private int bitField0_;
    private int id_;

    private ahgw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahgw create() {
        return new ahgw();
    }

    private void ensureArgumentIsMutable() {
        if ((this.bitField0_ & 2) != 2) {
            this.argument_ = new ArrayList(this.argument_);
            this.bitField0_ |= 2;
        }
    }

    public ahgw addArgument(ahgp ahgpVar) {
        ensureArgumentIsMutable();
        this.argument_.add(ahgpVar.build());
        return this;
    }

    @Override // defpackage.ahpf
    public ahgx build() {
        ahgx ahgxVarBuildPartial = buildPartial();
        if (ahgxVarBuildPartial.isInitialized()) {
            return ahgxVarBuildPartial;
        }
        throw newUninitializedMessageException(ahgxVarBuildPartial);
    }

    public ahgx buildPartial() {
        ahgx ahgxVar = new ahgx(this, (ahgm) null);
        int i = this.bitField0_ & 1;
        ahgxVar.id_ = this.id_;
        if ((this.bitField0_ & 2) == 2) {
            this.argument_ = DesugarCollections.unmodifiableList(this.argument_);
            this.bitField0_ &= -3;
        }
        ahgxVar.argument_ = this.argument_;
        ahgxVar.bitField0_ = i;
        return ahgxVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahgw mo86clone() {
        ahgw ahgwVarCreate = create();
        ahgwVarCreate.mergeFrom(buildPartial());
        return ahgwVarCreate;
    }

    public ahgv getArgument(int i) {
        return this.argument_.get(i);
    }

    public int getArgumentCount() {
        return this.argument_.size();
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahgx getDefaultInstanceForType() {
        return ahgx.getDefaultInstance();
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        if (!hasId()) {
            return false;
        }
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public ahgw mergeFrom(ahgx ahgxVar) {
        if (ahgxVar == ahgx.getDefaultInstance()) {
            return this;
        }
        if (ahgxVar.hasId()) {
            setId(ahgxVar.getId());
        }
        if (!ahgxVar.argument_.isEmpty()) {
            if (this.argument_.isEmpty()) {
                this.argument_ = ahgxVar.argument_;
                this.bitField0_ &= -3;
            } else {
                ensureArgumentIsMutable();
                this.argument_.addAll(ahgxVar.argument_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahgxVar.unknownFields));
        return this;
    }

    public ahgw setId(int i) {
        this.bitField0_ |= 1;
        this.id_ = i;
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
    public defpackage.ahgw mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahgx> r0 = defpackage.ahgx.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahgx r2 = (defpackage.ahgx) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahgx r3 = (defpackage.ahgx) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahgw.mergeFrom(ahoc, ahog):ahgw");
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
        mergeFrom((ahgx) ahoqVar);
        return this;
    }
}
