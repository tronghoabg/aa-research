package com.qonversion.android.sdk.dto.offerings;

import cb.AbstractC1593a;
import com.qonversion.android.sdk.dto.products.QProduct;
import ff.x;
import hb.AbstractC2797C;
import hb.K;
import hb.P;
import hb.r;
import hb.u;
import hb.w;
import ib.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "Lhb/K;", "moshi", "<init>", "(Lhb/K;)V", "", "toString", "()Ljava/lang/String;", "Lhb/w;", "reader", "fromJson", "(Lhb/w;)Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "Lhb/C;", "writer", "value_", "Lef/C;", "toJson", "(Lhb/C;Lcom/qonversion/android/sdk/dto/offerings/QOffering;)V", "Lhb/u;", "options", "Lhb/u;", "stringAdapter", "Lhb/r;", "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "qOfferingTagAdapter", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "listOfQProductAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QOfferingJsonAdapter extends r {

    @Nullable
    private volatile Constructor<QOffering> constructorRef;

    @NotNull
    private final r listOfQProductAdapter;

    @NotNull
    private final u options;

    @NotNull
    private final r qOfferingTagAdapter;

    @NotNull
    private final r stringAdapter;

    public QOfferingJsonAdapter(@NotNull K moshi) {
        AbstractC3340k.e(moshi, "moshi");
        this.options = u.a("id", "tag", "products");
        x xVar = x.f35434a;
        this.stringAdapter = moshi.c(String.class, xVar, "offeringID");
        this.qOfferingTagAdapter = moshi.c(QOfferingTag.class, xVar, "tag");
        this.listOfQProductAdapter = moshi.c(P.f(List.class, QProduct.class), xVar, "products");
    }

    @NotNull
    public String toString() {
        return AbstractC1593a.g(31, "GeneratedJsonAdapter(QOffering)", "toString(...)");
    }

    @Override // hb.r
    @NotNull
    public QOffering fromJson(@NotNull w reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC3340k.e(reader, "reader");
        reader.b();
        String str = null;
        QOfferingTag qOfferingTag = null;
        List list = null;
        int i5 = -1;
        while (reader.o()) {
            int iW = reader.W(this.options);
            if (iW == -1) {
                reader.Y();
                reader.Z();
            } else if (iW == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw f.l("offeringID", "id", reader);
                }
            } else if (iW == 1) {
                qOfferingTag = (QOfferingTag) this.qOfferingTagAdapter.fromJson(reader);
                if (qOfferingTag == null) {
                    throw f.l("tag", "tag", reader);
                }
            } else if (iW == 2) {
                list = (List) this.listOfQProductAdapter.fromJson(reader);
                if (list == null) {
                    throw f.l("products", "products", reader);
                }
                i5 = -5;
            } else {
                continue;
            }
        }
        reader.h();
        if (i5 == -5) {
            if (str == null) {
                throw f.f("offeringID", "id", reader);
            }
            if (qOfferingTag == null) {
                throw f.f("tag", "tag", reader);
            }
            AbstractC3340k.c(list, "null cannot be cast to non-null type kotlin.collections.List<com.qonversion.android.sdk.dto.products.QProduct>");
            return new QOffering(str, qOfferingTag, list);
        }
        Constructor<QOffering> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QOffering.class.getDeclaredConstructor(String.class, QOfferingTag.class, List.class, Integer.TYPE, f.f36941c);
            this.constructorRef = declaredConstructor;
            AbstractC3340k.d(declaredConstructor, "also(...)");
        }
        if (str == null) {
            throw f.f("offeringID", "id", reader);
        }
        if (qOfferingTag == null) {
            throw f.f("tag", "tag", reader);
        }
        QOffering qOfferingNewInstance = declaredConstructor.newInstance(str, qOfferingTag, list, Integer.valueOf(i5), null);
        AbstractC3340k.d(qOfferingNewInstance, "newInstance(...)");
        return qOfferingNewInstance;
    }

    @Override // hb.r
    public void toJson(@NotNull AbstractC2797C writer, @Nullable QOffering value_) {
        AbstractC3340k.e(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.w("id");
        this.stringAdapter.toJson(writer, value_.getOfferingID());
        writer.w("tag");
        this.qOfferingTagAdapter.toJson(writer, value_.getTag());
        writer.w("products");
        this.listOfQProductAdapter.toJson(writer, value_.getProducts());
        writer.i();
    }
}
