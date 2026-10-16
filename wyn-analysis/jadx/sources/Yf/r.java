package Yf;

import A.C0230x;
import A.e0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import za.C4658a;

/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final s f16874a = new s();

    public static final o a(Number number, String str) {
        return new o("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str, -1)), 1);
    }

    public static final o b(SerialDescriptor keyDescriptor) {
        AbstractC3340k.e(keyDescriptor, "keyDescriptor");
        return new o("Value of type '" + keyDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", 1);
    }

    public static final o c(int i5, CharSequence input, String message) {
        AbstractC3340k.e(message, "message");
        AbstractC3340k.e(input, "input");
        return d(i5, message + "\nJSON input: " + ((Object) m(input, i5)));
    }

    public static final o d(int i5, String message) {
        AbstractC3340k.e(message, "message");
        if (i5 >= 0) {
            message = "Unexpected JSON token at offset " + i5 + ": " + message;
        }
        return new o(message, 0);
    }

    public static final SerialDescriptor e(SerialDescriptor serialDescriptor, C4658a module) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        AbstractC3340k.e(module, "module");
        if (!AbstractC3340k.a(serialDescriptor.getKind(), Uf.i.f12829p)) {
            return serialDescriptor.isInline() ? e(serialDescriptor.g(0), module) : serialDescriptor;
        }
        KClass kClassD = Fe.e.D(serialDescriptor);
        if (kClassD == null) {
            return serialDescriptor;
        }
        module.f(kClassD, ff.v.f35432a);
        return serialDescriptor;
    }

    public static final byte f(char c10) {
        if (c10 < '~') {
            return C1303i.f16860b[c10];
        }
        return (byte) 0;
    }

    public static final String g(Xf.c json, SerialDescriptor serialDescriptor) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        AbstractC3340k.e(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof Xf.g) {
                return ((Xf.g) annotation).discriminator();
            }
        }
        return json.f16252a.f16277h;
    }

    public static final void h(Xf.c json, C0230x c0230x, KSerializer serializer, Object obj) {
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(serializer, "serializer");
        new E(json.f16252a.f16274e ? new m(c0230x, json) : new E4.F(c0230x, 6), json, I.f16834c, new Xf.m[I.f16839h.size()]).n(serializer, obj);
    }

    public static final int i(SerialDescriptor serialDescriptor, Xf.c json, String name) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(name, "name");
        n(json, serialDescriptor);
        int iC = serialDescriptor.c(name);
        if (iC != -3 || !json.f16252a.f16278i) {
            return iC;
        }
        s sVar = f16874a;
        Bf.g gVar = new Bf.g(3, serialDescriptor, json);
        e0 e0Var = json.f16254c;
        e0Var.getClass();
        Object objN = e0Var.n(serialDescriptor, sVar);
        if (objN == null) {
            objN = gVar.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e0Var.f152b;
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(sVar, objN);
        }
        Integer num = (Integer) ((Map) objN).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int j(SerialDescriptor serialDescriptor, Xf.c json, String name, String suffix) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(suffix, "suffix");
        int i5 = i(serialDescriptor, json, name);
        if (i5 != -3) {
            return i5;
        }
        throw new Sf.f(serialDescriptor.h() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final boolean k(Xf.c json, SerialDescriptor serialDescriptor) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        AbstractC3340k.e(json, "json");
        if (json.f16252a.f16271b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof Xf.n) {
                return true;
            }
        }
        return false;
    }

    public static final void l(J5.f fVar, String str) {
        fVar.q(fVar.f5633b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence m(CharSequence charSequence, int i5) {
        AbstractC3340k.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i5 != -1) {
                int i10 = i5 - 30;
                int i11 = i5 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder sbJ = N0.a.j(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                sbJ.append(charSequence.subSequence(i10, i11).toString());
                sbJ.append(str2);
                return sbJ.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void n(Xf.c json, SerialDescriptor serialDescriptor) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        AbstractC3340k.e(json, "json");
        AbstractC3340k.a(serialDescriptor.getKind(), Uf.j.f12831p);
    }

    public static final I o(Xf.c cVar, SerialDescriptor desc) {
        AbstractC3340k.e(cVar, "<this>");
        AbstractC3340k.e(desc, "desc");
        S3.f kind = desc.getKind();
        if (kind instanceof Uf.d) {
            return I.f16837f;
        }
        if (AbstractC3340k.a(kind, Uf.j.f12832q)) {
            return I.f16835d;
        }
        if (!AbstractC3340k.a(kind, Uf.j.f12833r)) {
            return I.f16834c;
        }
        SerialDescriptor serialDescriptorE = e(desc.g(0), cVar.f16253b);
        S3.f kind2 = serialDescriptorE.getKind();
        if ((kind2 instanceof Uf.f) || AbstractC3340k.a(kind2, Uf.i.f12830q)) {
            return I.f16836e;
        }
        if (cVar.f16252a.f16273d) {
            return I.f16835d;
        }
        throw b(serialDescriptorE);
    }

    public static final void p(J5.f fVar, Number number) {
        J5.f.r(fVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void q(String str, kotlinx.serialization.json.b element) {
        AbstractC3340k.e(element, "element");
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbW.append(kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(element.getClass()).getSimpleName());
        sbW.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new o(sbW.toString(), 1);
    }

    public static final String r(byte b5) {
        return b5 == 1 ? "quotation mark '\"'" : b5 == 2 ? "string escape sequence '\\'" : b5 == 4 ? "comma ','" : b5 == 5 ? "colon ':'" : b5 == 6 ? "start of the object '{'" : b5 == 7 ? "end of the object '}'" : b5 == 8 ? "start of the array '['" : b5 == 9 ? "end of the array ']'" : b5 == 10 ? "end of the input" : b5 == 127 ? "invalid token" : "valid token";
    }

    public static final String s(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(str2, -1));
    }
}
