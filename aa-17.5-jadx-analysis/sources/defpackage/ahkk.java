package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahkk extends ahok implements ahph {
    private int bitField0_;
    private List<ahki> requirement_ = Collections.EMPTY_LIST;

    private ahkk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ahkk create() {
        return new ahkk();
    }

    private void ensureRequirementIsMutable() {
        if ((this.bitField0_ & 1) != 1) {
            this.requirement_ = new ArrayList(this.requirement_);
            this.bitField0_ |= 1;
        }
    }

    @Override // defpackage.ahpf
    public ahkl build() {
        ahkl ahklVarBuildPartial = buildPartial();
        if (ahklVarBuildPartial.isInitialized()) {
            return ahklVarBuildPartial;
        }
        throw newUninitializedMessageException(ahklVarBuildPartial);
    }

    public ahkl buildPartial() {
        ahkl ahklVar = new ahkl(this, (ahgm) null);
        if ((this.bitField0_ & 1) == 1) {
            this.requirement_ = DesugarCollections.unmodifiableList(this.requirement_);
            this.bitField0_ &= -2;
        }
        ahklVar.requirement_ = this.requirement_;
        return ahklVar;
    }

    @Override // defpackage.ahok, defpackage.ahns
    /* renamed from: clone */
    public ahkk mo86clone() {
        ahkk ahkkVarCreate = create();
        ahkkVarCreate.mergeFrom(buildPartial());
        return ahkkVarCreate;
    }

    @Override // defpackage.ahok, defpackage.ahph
    public ahkl getDefaultInstanceForType() {
        return ahkl.getDefaultInstance();
    }

    @Override // defpackage.ahph
    public final boolean isInitialized() {
        return true;
    }

    public ahkk mergeFrom(ahkl ahklVar) {
        if (ahklVar == ahkl.getDefaultInstance()) {
            return this;
        }
        if (!ahklVar.requirement_.isEmpty()) {
            if (this.requirement_.isEmpty()) {
                this.requirement_ = ahklVar.requirement_;
                this.bitField0_ &= -2;
            } else {
                ensureRequirementIsMutable();
                this.requirement_.addAll(ahklVar.requirement_);
            }
        }
        setUnknownFields(getUnknownFields().concat(ahklVar.unknownFields));
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
    public defpackage.ahkk mergeFrom(defpackage.ahoc r2, defpackage.ahog r3) throws java.lang.Throwable {
        /*
            r1 = this;
            ahpi<ahkl> r0 = defpackage.ahkl.PARSER     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
            ahkl r2 = (defpackage.ahkl) r2     // Catch: java.lang.Throwable -> Le defpackage.ahou -> L10
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
            ahkl r3 = (defpackage.ahkl) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkk.mergeFrom(ahoc, ahog):ahkk");
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
        mergeFrom((ahkl) ahoqVar);
        return this;
    }
}
