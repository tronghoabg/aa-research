package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.waze.strings.DisplayStrings;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.s;
import h.g.b.w;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BasicTextContextMenuProvider implements TextContextMenuProvider {
    public static final int $stable = 0;
    private final s<TextContextMenuSession, TextContextMenuDataProvider, a<? extends LayoutCoordinates>, Composer, Integer, ab> contextMenuBlock;
    private final MutatorMutex mutatorMutex = new MutatorMutex();
    private final MutableState session$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: WazeSource */
    final class SessionImpl implements TextContextMenuSession {
        private final o<ab> channel = w.c(0, null, null, 7);
        private final TextContextMenuDataProvider dataProvider;

        public SessionImpl(TextContextMenuDataProvider textContextMenuDataProvider) {
            this.dataProvider = textContextMenuDataProvider;
        }

        public final Object awaitClose(e<? super ab> eVar) {
            Object objD = this.channel.d(eVar);
            return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public void close() {
            this.channel.i(ab.f48028a);
        }

        public final TextContextMenuDataProvider getDataProvider() {
            return this.dataProvider;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ SessionImpl $localSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SessionImpl sessionImpl, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$localSession = sessionImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return BasicTextContextMenuProvider.this.new AnonymousClass2(this.$localSession, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [h.ab, java.lang.Object] */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    BasicTextContextMenuProvider.this.setSession(this.$localSession);
                    this.label = 1;
                    if (this.$localSession.awaitClose(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                BasicTextContextMenuProvider.this.setSession(null);
                this = ab.f48028a;
                return this;
            } catch (Throwable th) {
                BasicTextContextMenuProvider.this.setSession(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextContextMenuProvider(s<? super TextContextMenuSession, ? super TextContextMenuDataProvider, ? super a<? extends LayoutCoordinates>, ? super Composer, ? super Integer, ab> sVar) {
        this.contextMenuBlock = sVar;
    }

    static final ab ContextMenu$lambda$0(BasicTextContextMenuProvider basicTextContextMenuProvider, a aVar, int i2, Composer composer, int i3) {
        basicTextContextMenuProvider.ContextMenu(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab ContextMenu$lambda$1(BasicTextContextMenuProvider basicTextContextMenuProvider, a aVar, int i2, Composer composer, int i3) {
        basicTextContextMenuProvider.ContextMenu(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final SessionImpl getSession() {
        return (SessionImpl) this.session$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSession(SessionImpl sessionImpl) {
        this.session$delegate.setValue(sessionImpl);
    }

    public final void ContextMenu(final a<? extends LayoutCoordinates> aVar, Composer composer, final int i2) {
        int i3;
        final a<? extends LayoutCoordinates> aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(723898654);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(723898654, i3, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            SessionImpl session = getSession();
            if (session == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$$ExternalSyntheticLambda0
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return BasicTextContextMenuProvider.ContextMenu$lambda$0(this.f$0, aVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            aVar2 = aVar;
            this.contextMenuBlock.invoke(session, session.getDataProvider(), aVar2, composerStartRestartGroup, Integer.valueOf((i3 << 6) & DisplayStrings.DS_TAP_TO_VERIFY));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new p() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicTextContextMenuProvider.ContextMenu$lambda$1(this.f$0, aVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void cancel() {
        SessionImpl session = getSession();
        if (session != null) {
            session.close();
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public Object showTextContextMenu(TextContextMenuDataProvider textContextMenuDataProvider, e<? super ab> eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(new SessionImpl(textContextMenuDataProvider), null), eVar, 1, null);
        return objMutate$default == h.c.a.a.f48038a ? objMutate$default : ab.f48028a;
    }
}
