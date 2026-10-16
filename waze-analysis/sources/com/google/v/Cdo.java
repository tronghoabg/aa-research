package com.google.v;

import com.google.v.Cdo;
import com.google.v.dq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* renamed from: com.google.v.do, reason: invalid class name */
/* loaded from: classes5.dex */
public class Cdo<MessageType extends dq<MessageType, BuilderType>, BuilderType extends Cdo<MessageType, BuilderType>> extends dm<MessageType, BuilderType> implements fj {
    protected Cdo(MessageType messagetype) {
        super(messagetype);
    }

    private dh<dr> ensureExtensionsAreMutable() {
        dh<dr> dhVar = ((dq) this.instance).extensions;
        if (!dhVar.f12848b) {
            return dhVar;
        }
        dh<dr> dhVarClone = dhVar.clone();
        ((dq) this.instance).extensions = dhVarClone;
        return dhVarClone;
    }

    private void verifyExtensionContainingType(ds<MessageType, ?> dsVar) {
        if (dsVar.f12875a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public final <Type> BuilderType addExtension(dc<MessageType, List<Type>> dcVar, Type type) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        copyOnWrite();
        ensureExtensionsAreMutable().k(dsVarCheckIsLite.f12878d, dsVarCheckIsLite.C(type));
        return this;
    }

    @Override // com.google.v.dm, com.google.v.fh
    public final MessageType buildPartial() {
        if (!((dq) this.instance).isMutable()) {
            return (MessageType) this.instance;
        }
        ((dq) this.instance).extensions.l();
        return (MessageType) super.buildPartial();
    }

    public final BuilderType clearExtension(dc<MessageType, ?> dcVar) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        copyOnWrite();
        dh<dr> dhVarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
        dr drVar = dsVarCheckIsLite.f12878d;
        fz fzVar = dhVarEnsureExtensionsAreMutable.f12847a;
        fzVar.remove(drVar);
        if (fzVar.isEmpty()) {
            dhVarEnsureExtensionsAreMutable.f12849c = false;
        }
        return this;
    }

    @Override // com.google.v.dm
    protected void copyOnWriteInternal() {
        super.copyOnWriteInternal();
        if (((dq) this.instance).extensions != dh.h()) {
            dq dqVar = (dq) this.instance;
            dqVar.extensions = dqVar.extensions.clone();
        }
    }

    public final <Type> Type getExtension(dc<MessageType, Type> dcVar) {
        return (Type) ((dq) this.instance).getExtension(dcVar);
    }

    public final <Type> int getExtensionCount(dc<MessageType, List<Type>> dcVar) {
        return ((dq) this.instance).getExtensionCount(dcVar);
    }

    public final <Type> boolean hasExtension(dc<MessageType, Type> dcVar) {
        return ((dq) this.instance).hasExtension(dcVar);
    }

    void internalSetExtensionSet(dh<dr> dhVar) {
        copyOnWrite();
        ((dq) this.instance).extensions = dhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List] */
    public final <Type> BuilderType setExtension(dc<MessageType, Type> dcVar, Type type) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        copyOnWrite();
        dh<dr> dhVarEnsureExtensionsAreMutable = ensureExtensionsAreMutable();
        dr drVar = dsVarCheckIsLite.f12878d;
        if (!drVar.f12873d) {
            type = (Type) dsVarCheckIsLite.C(type);
        } else if (drVar.c() == gn.f13029h) {
            Type arrayList = new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                arrayList.add(dsVarCheckIsLite.C(it.next()));
            }
            type = arrayList;
        }
        dhVarEnsureExtensionsAreMutable.n(drVar, type);
        return this;
    }

    public final <Type> Type getExtension(dc<MessageType, List<Type>> dcVar, int i2) {
        return (Type) ((dq) this.instance).getExtension(dcVar, i2);
    }

    public final <Type> BuilderType setExtension(dc<MessageType, List<Type>> dcVar, int i2, Type type) {
        ds<MessageType, ?> dsVarCheckIsLite = du.checkIsLite(dcVar);
        verifyExtensionContainingType(dsVarCheckIsLite);
        copyOnWrite();
        ensureExtensionsAreMutable().o(dsVarCheckIsLite.f12878d, i2, dsVarCheckIsLite.C(type));
        return this;
    }
}
