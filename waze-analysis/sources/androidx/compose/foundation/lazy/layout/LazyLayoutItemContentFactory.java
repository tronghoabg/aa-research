package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;
    private final a<LazyLayoutItemProvider> itemProvider;
    private final MutableScatterMap<Object, CachedItemContent> lambdasCache = ScatterMapKt.mutableScatterMapOf();
    private final SaveableStateHolder saveableStateHolder;

    /* compiled from: WazeSource */
    final class CachedItemContent {
        private p<? super Composer, ? super Integer, ab> _content;
        private final Object contentType;
        private int index;
        private final Object key;

        public CachedItemContent(int i2, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i2;
        }

        private final p<Composer, Integer, ab> createContentLambda() {
            final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = LazyLayoutItemContentFactory.this;
            return ComposableLambdaKt.composableLambdaInstance(818252804, true, new p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LazyLayoutItemContentFactory.CachedItemContent.createContentLambda$lambda$0(lazyLayoutItemContentFactory, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }

        static final ab createContentLambda$lambda$0(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, final CachedItemContent cachedItemContent, Composer composer, int i2) {
            Composer composer2;
            if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(818252804, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                LazyLayoutItemProvider lazyLayoutItemProviderInvoke = lazyLayoutItemContentFactory.getItemProvider().invoke();
                int index = cachedItemContent.index;
                if ((index >= lazyLayoutItemProviderInvoke.getItemCount() || !x.n(lazyLayoutItemProviderInvoke.getKey(index), cachedItemContent.key)) && (index = lazyLayoutItemProviderInvoke.getIndex(cachedItemContent.key)) != -1) {
                    cachedItemContent.index = index;
                }
                int i3 = index;
                if (i3 != -1) {
                    composer.startReplaceGroup(-1664741271);
                    composer2 = composer;
                    LazyLayoutItemContentFactoryKt.m2949SkippableItemJVlU9Rs(lazyLayoutItemProviderInvoke, lazyLayoutItemContentFactory.saveableStateHolder, i3, cachedItemContent.key, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer;
                    composer2.startReplaceGroup(-1664505826);
                    composer2.endReplaceGroup();
                }
                Object obj = cachedItemContent.key;
                boolean zChangedInstance = composer2.changedInstance(cachedItemContent);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$$ExternalSyntheticLambda1
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return LazyLayoutItemContentFactory.CachedItemContent.createContentLambda$lambda$0$0$0(this.f$0, (DisposableEffectScope) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                EffectsKt.DisposableEffect(obj, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult createContentLambda$lambda$0$0$0(final CachedItemContent cachedItemContent, DisposableEffectScope disposableEffectScope) {
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$lambda$0$0$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    this.this$0._content = null;
                }
            };
        }

        public final p<Composer, Integer, ab> getContent() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<Composer, Integer, ab> pVarCreateContentLambda = createContentLambda();
            this._content = pVarCreateContentLambda;
            return pVarCreateContentLambda;
        }

        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Object getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, a<? extends LazyLayoutItemProvider> aVar) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = aVar;
    }

    public final p<Composer, Integer, ab> getContent(int i2, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i2 && x.n(cachedItemContent.getContentType(), obj2)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i2, obj, obj2);
        this.lambdasCache.set(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    public final Object getContentType(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = this.itemProvider.invoke();
        int index = lazyLayoutItemProviderInvoke.getIndex(obj);
        if (index == -1) {
            return null;
        }
        return lazyLayoutItemProviderInvoke.getContentType(index);
    }

    public final a<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }
}
