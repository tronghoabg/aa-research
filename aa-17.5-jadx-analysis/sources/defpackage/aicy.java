package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aicy extends aggi {
    private final aiaw annotations;
    private final ahyy c;
    private final ahjv proto;

    /* JADX WARN: Illegal instructions before constructor call */
    public aicy(ahyy ahyyVar, ahjv ahjvVar, int i) {
        ahyyVar.getClass();
        ahjvVar.getClass();
        aiei storageManager = ahyyVar.getStorageManager();
        agbi containingDeclaration = ahyyVar.getContainingDeclaration();
        agfk empty = agfk.Companion.getEMPTY();
        ahnj name = ahzz.getName(ahyyVar.getNameResolver(), ahjvVar.getName());
        aiae aiaeVar = aiae.INSTANCE;
        ahju variance = ahjvVar.getVariance();
        variance.getClass();
        super(storageManager, containingDeclaration, empty, name, aiaeVar.variance(variance), ahjvVar.getReified(), i, agdx.NO_SOURCE, ageb.INSTANCE);
        this.c = ahyyVar;
        this.proto = ahjvVar;
        this.annotations = new aiaw(ahyyVar.getStorageManager(), new aicx(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List annotations$lambda$0(aicy aicyVar) {
        return woy.cf(aicyVar.c.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(aicyVar.proto, aicyVar.c.getNameResolver()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aggt
    /* renamed from: reportSupertypeLoopError, reason: merged with bridge method [inline-methods] */
    public Void mo92reportSupertypeLoopError(aigl aiglVar) {
        aiglVar.getClass();
        toString();
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: ".concat(toString()));
    }

    @Override // defpackage.aggt
    protected List<aigl> resolveUpperBounds() {
        List<ahjn> listUpperBounds = ahlg.upperBounds(this.proto, this.c.getTypeTable());
        if (listUpperBounds.isEmpty()) {
            return woy.bg(ahvz.getBuiltIns(this).getDefaultBound());
        }
        aian typeDeserializer = this.c.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(woy.bp(listUpperBounds, 10));
        Iterator<T> it = listUpperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((ahjn) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.agfa, defpackage.agez
    public aiaw getAnnotations() {
        return this.annotations;
    }
}
