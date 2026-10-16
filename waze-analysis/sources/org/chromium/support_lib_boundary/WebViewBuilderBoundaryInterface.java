package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import com.waze.mg$$ExternalSyntheticApiModelOutline0;
import j$.util.function.Consumer$CC;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface WebViewBuilderBoundaryInterface {

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
        public static final int PROFILE_NAME = 3;
        public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
    }

    void applyTo(WebView webView, Consumer<BiConsumer<Integer, Object>> consumer);

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);

    /* compiled from: WazeSource */
    public class Config implements Consumer<BiConsumer<Integer, Object>> {
        public String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;

        /* renamed from: a, reason: collision with root package name */
        final List f56427a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final Map f56428b = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        final List f56429c = new ArrayList();

        /* renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.f56427a, new ArrayList(this.f56428b.keySet()), this.f56429c});
            if (this.profileName != null) {
                biConsumer.accept(3, this.profileName);
            }
        }

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            Map map = this.f56428b;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException("A duplicate JavaScript interface was provided for \"" + str + "\"");
            }
            this.f56427a.add(obj);
            map.put(str, true);
            this.f56429c.add(list);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(BiConsumer<Integer, Object> biConsumer) {
            accept2(mg$$ExternalSyntheticApiModelOutline0.m28519m((Object) biConsumer));
        }
    }
}
