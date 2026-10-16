package androidx.compose.foundation.text.contextmenu.internal;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.aq;
import h.g.b.w;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidTextContextMenuToolbarProvider implements TextContextMenuProvider {
    public static final int $stable = 8;
    private ActionMode actionMode;
    private final l<TextActionModeCallback, TextActionModeCallback> callbackInjector;
    private final a<LayoutCoordinates> coordinatesProvider;
    private Runnable finishActionModeRunnable;
    private Runnable startActionModeRunnable;
    private final View view;
    private final MutatorMutex mutatorMutex = new MutatorMutex();
    private final SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return AndroidTextContextMenuToolbarProvider.snapshotStateObserver$lambda$0(this.f$0, (a) obj);
        }
    });
    private final l<Object, ab> onDataChange = new l() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda5
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return AndroidTextContextMenuToolbarProvider.onDataChange$lambda$0(this.f$0, obj);
        }
    };
    private final l<Object, ab> onPositionChange = new l() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda6
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return AndroidTextContextMenuToolbarProvider.onPositionChange$lambda$0(this.f$0, obj);
        }
    };

    /* compiled from: WazeSource */
    final class TextActionModeCallbackImpl implements TextActionModeCallback {
        private final a<TextContextMenuData> dataBuilder;
        private a<Rect> positioner;
        private TextContextMenuData previousData;
        private final TextContextMenuSession session;
        private final View view;

        public static /* synthetic */ boolean $r8$lambda$iBF5LEAJhMqvy1KvI9bmkI0Wv9Y(TextContextMenuComponent textContextMenuComponent, TextActionModeCallbackImpl textActionModeCallbackImpl, MenuItem menuItem) {
            updateMenuItems$lambda$0$0(textContextMenuComponent, textActionModeCallbackImpl, menuItem);
            return true;
        }

        public TextActionModeCallbackImpl(TextContextMenuSession textContextMenuSession, a<TextContextMenuData> aVar, a<Rect> aVar2, View view) {
            this.session = textContextMenuSession;
            this.dataBuilder = aVar;
            this.positioner = aVar2;
            this.view = view;
        }

        private final boolean updateMenuItems(Menu menu) {
            Menu menu2;
            TextContextMenuData textContextMenuDataInvoke = this.dataBuilder.invoke();
            int i2 = 0;
            if (x.n(textContextMenuDataInvoke, this.previousData)) {
                return false;
            }
            menu.clear();
            List<TextContextMenuComponent> components = textContextMenuDataInvoke.getComponents();
            int size = components.size();
            int i3 = 1;
            int i4 = 1;
            while (i2 < size) {
                final TextContextMenuComponent textContextMenuComponent = components.get(i2);
                if (textContextMenuComponent instanceof TextContextMenuItem) {
                    int i5 = i3 + 1;
                    Object key = textContextMenuComponent.getKey();
                    MenuItem menuItemAdd = menu.add(i4, x.n(key, TextContextMenuKeys.INSTANCE.getCutKey()) ? R.id.cut : x.n(key, TextContextMenuKeys.INSTANCE.getCopyKey()) ? R.id.copy : x.n(key, TextContextMenuKeys.INSTANCE.getPasteKey()) ? R.id.paste : x.n(key, TextContextMenuKeys.INSTANCE.getSelectAllKey()) ? R.id.selectAll : x.n(key, TextContextMenuKeys.INSTANCE.getAutofillKey()) ? R.id.autofill : i3, i3, ((TextContextMenuItem) textContextMenuComponent).getLabel());
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$TextActionModeCallbackImpl$$ExternalSyntheticLambda0
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl.$r8$lambda$iBF5LEAJhMqvy1KvI9bmkI0Wv9Y(textContextMenuComponent, this, menuItem);
                            return true;
                        }
                    });
                    i3 = i5;
                    menu2 = menu;
                } else if (textContextMenuComponent instanceof TextContextMenuTextClassificationItem) {
                    TextContextMenuTextClassificationItem textContextMenuTextClassificationItem = (TextContextMenuTextClassificationItem) textContextMenuComponent;
                    menu2 = menu;
                    TextToolbarHelperApi28.INSTANCE.addMenuItem(menu2, i3, this.view.getContext(), textContextMenuTextClassificationItem.getTextClassification(), textContextMenuTextClassificationItem.getIndex(), textContextMenuTextClassificationItem.getIcon());
                    i3++;
                } else {
                    menu2 = menu;
                    if (textContextMenuComponent instanceof TextContextMenuSeparator) {
                        i4++;
                    }
                }
                i2++;
                menu = menu2;
            }
            return true;
        }

        private static final boolean updateMenuItems$lambda$0$0(TextContextMenuComponent textContextMenuComponent, TextActionModeCallbackImpl textActionModeCallbackImpl, MenuItem menuItem) {
            ((TextContextMenuItem) textContextMenuComponent).getOnClick().invoke(textActionModeCallbackImpl.session);
            return true;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            updateMenuItems(menu);
            return menu.size() > 0;
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.session.close();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public Rect onGetContentRect(ActionMode actionMode, View view) {
            return this.positioner.invoke();
        }

        @Override // androidx.compose.foundation.text.contextmenu.internal.TextActionModeCallback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return updateMenuItems(menu);
        }
    }

    /* compiled from: WazeSource */
    final class TextContextMenuSessionImpl implements TextContextMenuSession {
        private final o<ab> channel = w.c(0, null, null, 7);

        public final Object awaitClose(e<? super ab> eVar) {
            Object objD = this.channel.d(eVar);
            return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public void close() {
            this.channel.i(ab.f48028a);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ TextContextMenuDataProvider $dataProvider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TextContextMenuDataProvider textContextMenuDataProvider, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$dataProvider = textContextMenuDataProvider;
        }

        static final void invokeSuspend$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextActionModeCallback textActionModeCallback, TextContextMenuSessionImpl textContextMenuSessionImpl) {
            ActionMode actionModeStartActionMode = TextToolbarHelper.INSTANCE.startActionMode(androidTextContextMenuToolbarProvider.view, textActionModeCallback);
            x.n(androidTextContextMenuToolbarProvider.actionMode, actionModeStartActionMode);
            if (actionModeStartActionMode == null) {
                textContextMenuSessionImpl.close();
            }
        }

        static final void invokeSuspend$lambda$2(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider) {
            ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
            if (actionMode != null) {
                actionMode.finish();
            }
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return AndroidTextContextMenuToolbarProvider.this.new AnonymousClass2(this.$dataProvider, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Looper looperMyLooper;
            Handler handler;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    final TextContextMenuSessionImpl textContextMenuSessionImpl = new TextContextMenuSessionImpl();
                    final TextActionModeCallback textActionModeCallbackCreateActionModeCallback = AndroidTextContextMenuToolbarProvider.this.createActionModeCallback(textContextMenuSessionImpl, this.$dataProvider);
                    AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = AndroidTextContextMenuToolbarProvider.this;
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = androidTextContextMenuToolbarProvider.view.getHandler();
                    Looper looper = handler2 != null ? handler2.getLooper() : null;
                    AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider2 = AndroidTextContextMenuToolbarProvider.this;
                    if (looperMyLooper2 != looper) {
                        Runnable runnable = androidTextContextMenuToolbarProvider2.startActionModeRunnable;
                        if (runnable == null) {
                            final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider3 = AndroidTextContextMenuToolbarProvider.this;
                            Runnable runnable2 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AndroidTextContextMenuToolbarProvider.AnonymousClass2.invokeSuspend$lambda$0(androidTextContextMenuToolbarProvider3, textActionModeCallbackCreateActionModeCallback, textContextMenuSessionImpl);
                                }
                            };
                            AndroidTextContextMenuToolbarProvider.this.startActionModeRunnable = runnable2;
                            runnable = runnable2;
                        }
                        AndroidTextContextMenuToolbarProvider.this.view.post(runnable);
                    } else {
                        ActionMode actionModeStartActionMode = TextToolbarHelper.INSTANCE.startActionMode(androidTextContextMenuToolbarProvider2.view, textActionModeCallbackCreateActionModeCallback);
                        if (actionModeStartActionMode == null) {
                            return ab.f48028a;
                        }
                        androidTextContextMenuToolbarProvider2.actionMode = actionModeStartActionMode;
                    }
                    this.label = 1;
                    if (textContextMenuSessionImpl.awaitClose(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                Looper looper2 = handler != null ? handler.getLooper() : null;
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider4 = AndroidTextContextMenuToolbarProvider.this;
                if (looperMyLooper != looper2) {
                    Runnable runnable3 = androidTextContextMenuToolbarProvider4.finishActionModeRunnable;
                    if (runnable3 == null) {
                        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider5 = AndroidTextContextMenuToolbarProvider.this;
                        Runnable runnable4 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider.AnonymousClass2.invokeSuspend$lambda$2(androidTextContextMenuToolbarProvider5);
                            }
                        };
                        AndroidTextContextMenuToolbarProvider.this.finishActionModeRunnable = runnable4;
                        runnable3 = runnable4;
                    }
                    AndroidTextContextMenuToolbarProvider.this.view.post(runnable3);
                } else {
                    ActionMode actionMode = androidTextContextMenuToolbarProvider4.actionMode;
                    if (actionMode != null) {
                        actionMode.finish();
                    }
                }
                Runnable runnable5 = AndroidTextContextMenuToolbarProvider.this.startActionModeRunnable;
                if (runnable5 != null) {
                    AndroidTextContextMenuToolbarProvider.this.view.removeCallbacks(runnable5);
                }
                AndroidTextContextMenuToolbarProvider.this.actionMode = null;
                return ab.f48028a;
            } finally {
                AndroidTextContextMenuToolbarProvider.this.snapshotStateObserver.clear();
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider6 = AndroidTextContextMenuToolbarProvider.this;
                looperMyLooper = Looper.myLooper();
                handler = androidTextContextMenuToolbarProvider6.view.getHandler();
                Looper looper3 = handler != null ? handler.getLooper() : null;
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider7 = AndroidTextContextMenuToolbarProvider.this;
                if (looperMyLooper != looper3) {
                    Runnable runnable6 = androidTextContextMenuToolbarProvider7.finishActionModeRunnable;
                    if (runnable6 == null) {
                        final AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider8 = AndroidTextContextMenuToolbarProvider.this;
                        Runnable runnable7 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider.AnonymousClass2.invokeSuspend$lambda$2(androidTextContextMenuToolbarProvider8);
                            }
                        };
                        AndroidTextContextMenuToolbarProvider.this.finishActionModeRunnable = runnable7;
                        runnable6 = runnable7;
                    }
                    AndroidTextContextMenuToolbarProvider.this.view.post(runnable6);
                } else {
                    ActionMode actionMode2 = androidTextContextMenuToolbarProvider7.actionMode;
                    if (actionMode2 != null) {
                        actionMode2.finish();
                    }
                }
                Runnable runnable8 = AndroidTextContextMenuToolbarProvider.this.startActionModeRunnable;
                if (runnable8 != null) {
                    AndroidTextContextMenuToolbarProvider.this.view.removeCallbacks(runnable8);
                }
                AndroidTextContextMenuToolbarProvider.this.actionMode = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidTextContextMenuToolbarProvider(View view, l<? super TextActionModeCallback, ? extends TextActionModeCallback> lVar, a<? extends LayoutCoordinates> aVar) {
        this.view = view;
        this.callbackInjector = lVar;
        this.coordinatesProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextActionModeCallback createActionModeCallback(TextContextMenuSessionImpl textContextMenuSessionImpl, final TextContextMenuDataProvider textContextMenuDataProvider) {
        TextActionModeCallback textActionModeCallbackInvoke;
        TextActionModeCallbackImpl textActionModeCallbackImpl = new TextActionModeCallbackImpl(textContextMenuSessionImpl, new a() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.observeAndGetData(textContextMenuDataProvider);
            }
        }, new a() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.observeAndGetBounds(textContextMenuDataProvider);
            }
        }, this.view);
        l<TextActionModeCallback, TextActionModeCallback> lVar = this.callbackInjector;
        return (lVar == null || (textActionModeCallbackInvoke = lVar.invoke(textActionModeCallbackImpl)) == null) ? textActionModeCallbackImpl : textActionModeCallbackInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect observeAndGetBounds(final TextContextMenuDataProvider textContextMenuDataProvider) {
        return (Rect) observeReadsAndGet("positioner", this.onPositionChange, new a() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                return AndroidTextContextMenuToolbarProvider.observeAndGetBounds$lambda$0(this.f$0, textContextMenuDataProvider);
            }
        });
    }

    static final Rect observeAndGetBounds$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, TextContextMenuDataProvider textContextMenuDataProvider) {
        LayoutCoordinates layoutCoordinatesInvoke = androidTextContextMenuToolbarProvider.coordinatesProvider.invoke();
        if (true != layoutCoordinatesInvoke.isAttached()) {
            layoutCoordinatesInvoke = null;
        }
        LayoutCoordinates layoutCoordinates = layoutCoordinatesInvoke;
        return layoutCoordinates == null ? Rect.Companion.getZero() : textContextMenuDataProvider.contentBounds(layoutCoordinates).m8017translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextContextMenuData observeAndGetData(final TextContextMenuDataProvider textContextMenuDataProvider) {
        return (TextContextMenuData) observeReadsAndGet("dataBuilder", this.onDataChange, new a() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return textContextMenuDataProvider.data();
            }
        });
    }

    private final <T, S> T observeReadsAndGet(S s, l<? super S, ab> lVar, final a<? extends T> aVar) {
        final aq aqVar = new aq();
        this.snapshotStateObserver.observeReads(s, lVar, new a() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return AndroidTextContextMenuToolbarProvider.observeReadsAndGet$lambda$0(aqVar, aVar);
            }
        });
        T t = (T) aqVar.f48105a;
        if (t != null) {
            return t;
        }
        x.j("result");
        return (T) ab.f48028a;
    }

    static final ab observeReadsAndGet$lambda$0(aq aqVar, a aVar) {
        aqVar.f48105a = aVar.invoke();
        return ab.f48028a;
    }

    static final ab onDataChange$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        }
        return ab.f48028a;
    }

    static final ab onPositionChange$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, Object obj) {
        ActionMode actionMode = androidTextContextMenuToolbarProvider.actionMode;
        if (actionMode != null) {
            TextToolbarHelper.INSTANCE.invalidateContentRect(actionMode);
        }
        return ab.f48028a;
    }

    static final ab snapshotStateObserver$lambda$0(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, final a aVar) {
        Handler handler = androidTextContextMenuToolbarProvider.view.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
        } else {
            Handler handler2 = androidTextContextMenuToolbarProvider.view.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.invoke();
                    }
                });
            }
        }
        return ab.f48028a;
    }

    public final void dispose() {
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public Object showTextContextMenu(TextContextMenuDataProvider textContextMenuDataProvider, e<? super ab> eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(textContextMenuDataProvider, null), eVar, 1, null);
        return objMutate$default == h.c.a.a.f48038a ? objMutate$default : ab.f48028a;
    }

    public final void start() {
        this.snapshotStateObserver.start();
    }
}
