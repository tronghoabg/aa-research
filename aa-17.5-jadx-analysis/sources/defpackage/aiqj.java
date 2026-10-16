package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class aiqj {
    public static final void a(afco afcoVar, Throwable th) {
        Iterator it = ajbx.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(afcoVar, th);
            } catch (ajcc unused) {
                return;
            } catch (Throwable th2) {
                ajbx.a(aiiu.a(th, th2));
            }
        }
        try {
            adqs.y(th, new ajbz(afcoVar));
        } catch (Throwable unused2) {
        }
        ajbx.a(th);
    }

    public static final List<afic> allTypeParameters(afhe<?> afheVar) {
        afheVar.getClass();
        return afrg.j(afrg.p(afrg.f(afheVar, aiqh.INSTANCE), aiqi.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afhe allTypeParameters$lambda$0(afhe afheVar) {
        Class<?> declaringClass;
        afheVar.getClass();
        if (!afheVar.isInner() || (declaringClass = affa.h(afheVar).getDeclaringClass()) == null) {
            return null;
        }
        return affa.l(declaringClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable allTypeParameters$lambda$1(afhe afheVar) {
        afheVar.getClass();
        return afheVar.getTypeParameters();
    }

    public static final afib captureKTypeFromArguments(afib afibVar) {
        int i;
        afibVar.getClass();
        afhf classifier = afibVar.getClassifier();
        afhe<?> afheVar = classifier instanceof afhe ? (afhe) classifier : null;
        if (afheVar != null) {
            List<afid> arguments = afibVar.getArguments();
            if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                Iterator<T> it = arguments.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    afie afieVar = ((afid) it.next()).b;
                    afie afieVar2 = afie.a;
                    if (afieVar != afieVar2) {
                        List<afic> listAllTypeParameters = allTypeParameters(afheVar);
                        if (listAllTypeParameters.size() == arguments.size()) {
                            ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
                            Iterator<T> it2 = arguments.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                afid afidVarF = (afid) it2.next();
                                afie afieVar3 = afidVarF.b;
                                if (afieVar3 != afieVar2) {
                                    afib afibVar2 = afidVarF.c;
                                    if (afieVar3 != afie.b) {
                                        afibVar2 = null;
                                    }
                                    afidVarF = afik.f(new aiqf(afibVar2, new aiqg(afidVarF), false));
                                }
                                arrayList.add(afidVarF);
                            }
                            aiqu aiquVarCreate = aiqu.Companion.create(afheVar, arrayList, false, false);
                            int size = arguments.size();
                            for (i = 0; i < size; i++) {
                                afid afidVar = arguments.get(i);
                                afie afieVar4 = afidVar.b;
                                if (afieVar4 != afieVar2) {
                                    List<afib> upperBounds = listAllTypeParameters.get(i).getUpperBounds();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it3 = upperBounds.iterator();
                                    while (it3.hasNext()) {
                                        afib afibVar3 = aiqu.substitute$default(aiquVarCreate, (afib) it3.next(), null, 2, null).c;
                                        afibVar3.getClass();
                                        arrayList2.add(afibVar3);
                                    }
                                    if (afieVar4 == afie.c) {
                                        afib afibVar4 = afidVar.c;
                                        afibVar4.getClass();
                                        arrayList2.add(afibVar4);
                                    }
                                    afib afibVar5 = ((afid) arrayList.get(i)).c;
                                    afibVar5.getClass();
                                    ((aiqf) afibVar5).getTypeConstructor().setSupertypes(arrayList2);
                                }
                            }
                            boolean zIsMarkedNullable = afibVar.isMarkedNullable();
                            List<Annotation> annotations = afibVar.getAnnotations();
                            boolean z = afibVar instanceof aiqc;
                            aiqc aiqcVar = z ? (aiqc) afibVar : null;
                            afib abbreviation = aiqcVar != null ? aiqcVar.getAbbreviation() : null;
                            aiqc aiqcVar2 = z ? (aiqc) afibVar : null;
                            return new aire(afheVar, arrayList, zIsMarkedNullable, annotations, abbreviation, false, false, false, aiqcVar2 != null ? aiqcVar2.getMutableCollectionClass() : null, null, sk.AUDIO_CONTENT_BUFFER_SIZE, null);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void javaTypeNotSupported() {
        throw new aftw("javaType for captured types is not supported");
    }
}
