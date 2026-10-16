package com.qonversion.android.sdk.automations.internal.macros;

import Af.n;
import Bf.f;
import Bf.i;
import Bf.k;
import Bf.r;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.internal.macros.MacrosType;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import ef.C2515C;
import ff.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import tf.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJM\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J=\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "", "<init>", "()V", "", "LBf/f;", "matchResults", "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;", "convertMatchResultToMacros", "(Ljava/util/List;)Ljava/util/List;", "", "originalHtml", "macroses", "Lkotlin/Function1;", "Lef/C;", "onComplete", "Lcom/qonversion/android/sdk/dto/QonversionError;", "onError", "processMacroses", "(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V", "html", "processScreen", "(Ljava/lang/String;Ltf/l;Ltf/l;)V", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenProcessor {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MACROS_BRACKETS_NUMBER = 2;

    @NotNull
    private static final String MACROS_CATEGORY_KEY = "category";

    @NotNull
    private static final String MACROS_ID_KEY = "uid";

    @NotNull
    private static final String MACROS_PRODUCT_CATEGORY = "product";

    @NotNull
    private static final String MACROS_REGEX = "\\[\\[.*?\\]\\]";

    @NotNull
    private static final String MACROS_TYPE_KEY = "type";

    @NotNull
    private final ConsoleLogger logger = new ConsoleLogger();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;", "", "()V", "MACROS_BRACKETS_NUMBER", "", "MACROS_CATEGORY_KEY", "", "MACROS_ID_KEY", "MACROS_PRODUCT_CATEGORY", "MACROS_REGEX", "getMACROS_REGEX$annotations", "MACROS_TYPE_KEY", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getMACROS_REGEX$annotations() {
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lef/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor$processScreen$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21521 extends AbstractC3343n implements l {
        final /* synthetic */ l $onComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21521(l lVar) {
            super(1);
            this.$onComplete = lVar;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull String it) {
            AbstractC3340k.e(it, "it");
            this.$onComplete.invoke(it);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "it", "Lef/C;", "invoke", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor$processScreen$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // tf.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((QonversionError) obj);
            return C2515C.f34653a;
        }

        public final void invoke(@NotNull QonversionError it) {
            AbstractC3340k.e(it, "it");
            this.$onError.invoke(it);
        }
    }

    private final List<Macros> convertMatchResultToMacros(List<? extends f> matchResults) throws JSONException {
        String string;
        String string2;
        String string3;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = matchResults.iterator();
        while (it.hasNext()) {
            String str = (String) o.q0(((f) it.next()).a());
            String strP0 = k.p0(2, str);
            int length = strP0.length() - 2;
            if (length < 0) {
                length = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject(k.T0(length, strP0));
                string = jSONObject.getString(MACROS_CATEGORY_KEY);
                string2 = jSONObject.getString("type");
                string3 = jSONObject.getString(MACROS_ID_KEY);
            } catch (JSONException e7) {
                this.logger.error("Failed to parse screen macros. " + e7);
            }
            if (AbstractC3340k.a(string, "product")) {
                AbstractC3340k.b(string3);
                if (string3.length() != 0) {
                    MacrosType.Companion companion = MacrosType.INSTANCE;
                    AbstractC3340k.b(string2);
                    arrayList.add(new Macros(companion.fromType(string2), string3, str));
                }
            }
            this.logger.error("Invalid macros value");
        }
        return arrayList;
    }

    private final void processMacroses(final String originalHtml, final List<Macros> macroses, final l onComplete, final l onError) {
        if (macroses.isEmpty()) {
            onComplete.invoke(originalHtml);
        } else {
            Qonversion.INSTANCE.getSharedInstance().products(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor.processMacroses.1

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor$processMacroses$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[MacrosType.values().length];
                        try {
                            iArr[MacrosType.Price.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
                public void onError(@NotNull QonversionError error) {
                    AbstractC3340k.e(error, "error");
                    onError.invoke(error);
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
                public void onSuccess(@NotNull Map<String, QProduct> products) {
                    String prettyPrice;
                    AbstractC3340k.e(products, "products");
                    String strH0 = originalHtml;
                    for (Macros macros : macroses) {
                        QProduct qProduct = products.get(macros.getProductID());
                        if (qProduct != null) {
                            if (WhenMappings.$EnumSwitchMapping$0[macros.getType().ordinal()] == 1 && (prettyPrice = qProduct.getPrettyPrice()) != null) {
                                strH0 = r.h0(strH0, macros.getOriginalMacrosString(), prettyPrice, false);
                            }
                        }
                    }
                    onComplete.invoke(strH0);
                }
            });
        }
    }

    public final void processScreen(@NotNull String html, @NotNull l onComplete, @NotNull l onError) {
        AbstractC3340k.e(html, "html");
        AbstractC3340k.e(onComplete, "onComplete");
        AbstractC3340k.e(onError, "onError");
        processMacroses(html, convertMatchResultToMacros(n.e0(new i(MACROS_REGEX).a(html))), new C21521(onComplete), new AnonymousClass2(onError));
    }
}
