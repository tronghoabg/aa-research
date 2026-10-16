package com.google.v;

import com.google.v.Cdo;
import com.google.v.dq;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class dq<MessageType extends dq<MessageType, BuilderType>, BuilderType extends Cdo<MessageType, BuilderType>> extends du<MessageType, BuilderType> implements fj {
    protected dh<dr> extensions = dh.h();

    private void eagerlyMergeMessageSetExtension(z zVar, ds<?, ?> dsVar, de deVar, int i2) {
        parseExtension(zVar, deVar, dsVar, go.c(i2, 2), i2);
    }

    private void mergeMessageSetExtensionFromBytes(v vVar, de deVar, ds<?, ?> dsVar) {
        dh<dr> dhVar = this.extensions;
        dr drVar = dsVar.f12878d;
        fi fiVar = (fi) dhVar.i(drVar);
        fh builder = fiVar != null ? fiVar.toBuilder() : null;
        if (builder == null) {
            builder = dsVar.f12877c.newBuilderForType();
        }
        builder.mergeFrom(vVar, deVar);
        ensureExtensionsAreMutable().n(drVar, dsVar.C(builder.build()));
    }

    private <MessageType2 extends fi> void mergeMessageSetExtensionFromCodedStream(MessageType2 messagetype2, z zVar, de deVar) {
        v vVarB = null;
        ds dsVarD = null;
        int iR = 0;
        while (true) {
            int iQ = zVar.q();
            if (iQ == 0) {
                break;
            }
            if (iQ == go.f13034c) {
                iR = zVar.r();
                if (iR != 0) {
                    dsVarD = deVar.d(messagetype2, iR);
                }
            } else if (iQ == go.f13035d) {
                if (iR == 0) {
                    iR = 0;
                } else if (dsVarD != null) {
                    eagerlyMergeMessageSetExtension(zVar, dsVarD, deVar, iR);
                    vVarB = null;
                } else {
                    dsVarD = null;
                }
                vVarB = zVar.B();
            } else if (!zVar.L(iQ)) {
                break;
            }
        }
        zVar.E(go.f13033b);
        if (vVarB == null || iR == 0) {
            return;
        }
        if (dsVarD != null) {
            mergeMessageSetExtensionFromBytes(vVarB, deVar, dsVarD);
        } else {
            mergeLengthDelimitedField(iR, vVarB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0004 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean parseExtension(com.google.v.z r7, com.google.v.de r8, com.google.v.ds<?, ?> r9, int r10, int r11) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r9 != 0) goto L7
        L4:
            r2 = r1
            r1 = r0
            goto L29
        L7:
            int r2 = com.google.v.go.b(r10)
            com.google.v.dr r3 = r9.f12878d
            com.google.v.gm r4 = r3.f12872c
            int r5 = com.google.v.dh.f(r4, r1)
            if (r2 != r5) goto L17
            r2 = r1
            goto L29
        L17:
            boolean r3 = r3.f12873d
            if (r3 == 0) goto L4
            int r3 = r4.ordinal()
            switch(r3) {
                case 8: goto L4;
                case 9: goto L4;
                case 10: goto L4;
                case 11: goto L4;
                default: goto L22;
            }
        L22:
            int r3 = com.google.v.dh.f(r4, r0)
            if (r2 != r3) goto L4
            r2 = r0
        L29:
            if (r1 == 0) goto L30
            boolean r6 = r6.parseUnknownField(r10, r7)
            return r6
        L30:
            r6.ensureExtensionsAreMutable()
            if (r2 == 0) goto L78
            int r8 = r7.k()
            int r8 = r7.f(r8)
            com.google.v.dr r10 = r9.f12878d
            com.google.v.gm r11 = r10.f12872c
            com.google.v.gm r1 = com.google.v.gm.ENUM
            if (r11 != r1) goto L63
        L45:
            int r11 = r7.d()
            if (r11 <= 0) goto L73
            int r11 = r7.g()
            com.google.v.eh r1 = r10.f12870a
            com.google.v.eg r11 = r1.findValueByNumber(r11)
            if (r11 != 0) goto L59
            goto Le5
        L59:
            com.google.v.dh<com.google.v.dr> r1 = r6.extensions
            java.lang.Object r11 = r9.C(r11)
            r1.k(r10, r11)
            goto L45
        L63:
            int r9 = r7.d()
            if (r9 <= 0) goto L73
            java.lang.Object r9 = com.google.v.dh.s(r7, r11)
            com.google.v.dh<com.google.v.dr> r1 = r6.extensions
            r1.k(r10, r9)
            goto L63
        L73:
            r7.F(r8)
            goto Le5
        L78:
            com.google.v.gn r10 = com.google.v.gn.f13022a
            com.google.v.dr r10 = r9.f12878d
            com.google.v.gn r1 = r10.c()
            int r1 = r1.ordinal()
            r2 = 7
            if (r1 == r2) goto Lc3
            r11 = 8
            if (r1 == r11) goto L92
            com.google.v.gm r8 = r10.f12872c
            java.lang.Object r7 = com.google.v.dh.s(r7, r8)
            goto Ld0
        L92:
            boolean r11 = r10.f12873d
            r1 = 0
            if (r11 != 0) goto La5
            com.google.v.dh<com.google.v.dr> r11 = r6.extensions
            java.lang.Object r11 = r11.i(r10)
            com.google.v.fi r11 = (com.google.v.fi) r11
            if (r11 == 0) goto La5
            com.google.v.fh r1 = r11.toBuilder()
        La5:
            if (r1 != 0) goto Lad
            com.google.v.fi r11 = r9.f12877c
            com.google.v.fh r1 = r11.newBuilderForType()
        Lad:
            com.google.v.gm r11 = r10.f12872c
            com.google.v.gm r2 = com.google.v.gm.GROUP
            if (r11 != r2) goto Lbb
            int r11 = r9.z()
            r7.G(r11, r1, r8)
            goto Lbe
        Lbb:
            r7.H(r1, r8)
        Lbe:
            com.google.v.fi r7 = r1.build()
            goto Ld0
        Lc3:
            int r7 = r7.g()
            com.google.v.eh r8 = r10.f12870a
            com.google.v.eg r8 = r8.findValueByNumber(r7)
            if (r8 == 0) goto Le6
            r7 = r8
        Ld0:
            boolean r8 = r10.f12873d
            com.google.v.dh<com.google.v.dr> r6 = r6.extensions
            if (r8 == 0) goto Lde
            java.lang.Object r7 = r9.C(r7)
            r6.k(r10, r7)
            goto Le5
        Lde:
            java.lang.Object r7 = r9.C(r7)
            r6.n(r10, r7)
        Le5:
            return r0
        Le6:
            r6.mergeVarintField(r11, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.dq.parseExtension(com.google.v.z, com.google.v.de, com.google.v.ds, int, int):boolean");
    }

    private void verifyExtensionContainingType(ds<MessageType, ?> dsVar) {
        if (dsVar.f12875a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    dh<dr> ensureExtensionsAreMutable() {
        dh<dr> dhVar = this.extensions;
        if (dhVar.f12848b) {
            this.extensions = dhVar.clone();
        }
        return this.extensions;
    }

    protected boolean extensionsAreInitialized() {
        return this.extensions.r();
    }

    protected int extensionsSerializedSize() {
        return this.extensions.e();
    }

    protected int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Type, com.google.v.f, com.google.v.fr] */
    public final <Type> Type getExtension(dc<MessageType, Type> dcVar) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        dh<dr> dhVar = this.extensions;
        dr drVar = dsVarCheckIsLite.f12878d;
        Type type = (Type) dhVar.i(drVar);
        if (type == null) {
            return (Type) dsVarCheckIsLite.f12876b;
        }
        if (!drVar.f12873d) {
            return (Type) dsVarCheckIsLite.B(type);
        }
        if (drVar.c() != gn.f13029h) {
            return type;
        }
        ?? r0 = (Type) new fr();
        List list = (List) type;
        r0.e(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r0.add(dsVarCheckIsLite.B(it.next()));
        }
        r0.b();
        return r0;
    }

    public final <Type> int getExtensionCount(dc<MessageType, List<Type>> dcVar) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        dh<dr> dhVar = this.extensions;
        dr drVar = dsVarCheckIsLite.f12878d;
        if (!drVar.f12873d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = dhVar.i(drVar);
        if (objI == null) {
            return 0;
        }
        return ((List) objI).size();
    }

    public final <Type> boolean hasExtension(dc<MessageType, Type> dcVar) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        dh<dr> dhVar = this.extensions;
        dr drVar = dsVarCheckIsLite.f12878d;
        if (drVar.f12873d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return dhVar.f12847a.get(drVar) != null;
    }

    protected final void mergeExtensionFields(MessageType messagetype) {
        dh<dr> dhVar = this.extensions;
        if (dhVar.f12848b) {
            this.extensions = dhVar.clone();
        }
        this.extensions.m(messagetype.extensions);
    }

    protected dp newExtensionWriter() {
        return new dp(this);
    }

    protected dp newMessageSetExtensionWriter() {
        return new dp(this);
    }

    protected <MessageType2 extends fi> boolean parseUnknownField(MessageType2 messagetype2, z zVar, de deVar, int i2) {
        int iA = go.a(i2);
        return parseExtension(zVar, deVar, deVar.d(messagetype2, iA), i2, iA);
    }

    protected <MessageType2 extends fi> boolean parseUnknownFieldAsMessageSet(MessageType2 messagetype2, z zVar, de deVar, int i2) {
        if (i2 != go.f13032a) {
            return go.b(i2) == 2 ? parseUnknownField(messagetype2, zVar, deVar, i2) : zVar.L(i2);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype2, zVar, deVar);
        return true;
    }

    public final <Type> Type getExtension(dc<MessageType, List<Type>> dcVar, int i2) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        dh<dr> dhVar = this.extensions;
        dr drVar = dsVarCheckIsLite.f12878d;
        if (drVar.f12873d) {
            Object objI = dhVar.i(drVar);
            if (objI != null) {
                return (Type) dsVarCheckIsLite.B(((List) objI).get(i2));
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
