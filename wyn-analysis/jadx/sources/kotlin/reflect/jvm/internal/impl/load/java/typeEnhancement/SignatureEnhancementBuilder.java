package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import Af.b;
import Af.q;
import Af.t;
import ef.C2527k;
import ff.AbstractC2641B;
import ff.p;
import ff.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
final class SignatureEnhancementBuilder {

    @NotNull
    private final Map<String, PredefinedFunctionEnhancementInfo> signatures = new LinkedHashMap();

    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> build() {
        return this.signatures;
    }

    public final class ClassEnhancementBuilder {

        @NotNull
        private final String className;
        final /* synthetic */ SignatureEnhancementBuilder this$0;

        public ClassEnhancementBuilder(@NotNull SignatureEnhancementBuilder signatureEnhancementBuilder, String className) {
            AbstractC3340k.e(className, "className");
            this.this$0 = signatureEnhancementBuilder;
            this.className = className;
        }

        public final void function(@NotNull String name, @NotNull l block) {
            AbstractC3340k.e(name, "name");
            AbstractC3340k.e(block, "block");
            Map map = this.this$0.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, name);
            block.invoke(functionEnhancementBuilder);
            C2527k c2527kBuild = functionEnhancementBuilder.build();
            map.put(c2527kBuild.f34671a, c2527kBuild.f34672b);
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        public final class FunctionEnhancementBuilder {

            @NotNull
            private final String functionName;

            @NotNull
            private final List<C2527k> parameters;

            @NotNull
            private C2527k returnType;
            final /* synthetic */ ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(@NotNull ClassEnhancementBuilder classEnhancementBuilder, String functionName) {
                AbstractC3340k.e(functionName, "functionName");
                this.this$0 = classEnhancementBuilder;
                this.functionName = functionName;
                this.parameters = new ArrayList();
                this.returnType = new C2527k("V", null);
            }

            @NotNull
            public final C2527k build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.this$0.getClassName();
                String str = this.functionName;
                List<C2527k> list = this.parameters;
                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((C2527k) it.next()).f34671a);
                }
                String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, (String) this.returnType.f34671a));
                TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) this.returnType.f34672b;
                List<C2527k> list2 = this.parameters;
                ArrayList arrayList2 = new ArrayList(p.a0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((TypeEnhancementInfo) ((C2527k) it2.next()).f34672b);
                }
                return new C2527k(strSignature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList2));
            }

            public final void parameter(@NotNull String type, @NotNull JavaTypeQualifiers... qualifiers) {
                TypeEnhancementInfo typeEnhancementInfo;
                AbstractC3340k.e(type, "type");
                AbstractC3340k.e(qualifiers, "qualifiers");
                List<C2527k> list = this.parameters;
                if (qualifiers.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    t tVar = new t(new q(qualifiers, 27), 3);
                    int iD = AbstractC2641B.D(p.a0(tVar, 10));
                    if (iD < 16) {
                        iD = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
                    Iterator it = tVar.iterator();
                    while (true) {
                        b bVar = (b) it;
                        if (!bVar.f1290c.hasNext()) {
                            break;
                        }
                        y yVar = (y) bVar.next();
                        linkedHashMap.put(Integer.valueOf(yVar.f35435a), (JavaTypeQualifiers) yVar.f35436b);
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(new C2527k(type, typeEnhancementInfo));
            }

            public final void returns(@NotNull JvmPrimitiveType type) {
                AbstractC3340k.e(type, "type");
                String desc = type.getDesc();
                AbstractC3340k.d(desc, "getDesc(...)");
                this.returnType = new C2527k(desc, null);
            }

            public final void returns(@NotNull String type, @NotNull JavaTypeQualifiers... qualifiers) {
                AbstractC3340k.e(type, "type");
                AbstractC3340k.e(qualifiers, "qualifiers");
                t tVar = new t(new q(qualifiers, 27), 3);
                int iD = AbstractC2641B.D(p.a0(tVar, 10));
                if (iD < 16) {
                    iD = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
                Iterator it = tVar.iterator();
                while (true) {
                    b bVar = (b) it;
                    if (bVar.f1290c.hasNext()) {
                        y yVar = (y) bVar.next();
                        linkedHashMap.put(Integer.valueOf(yVar.f35435a), (JavaTypeQualifiers) yVar.f35436b);
                    } else {
                        this.returnType = new C2527k(type, new TypeEnhancementInfo(linkedHashMap));
                        return;
                    }
                }
            }
        }
    }
}
