package androidx.work.impl.utils;

import androidx.work.ExecutionEventListener;
import androidx.work.ScheduleEventListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ListenerEventDispatchKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.ListenerEventDispatchKt$dispatchEvent$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ q $block;
        final /* synthetic */ Object $snapshotData;
        final /* synthetic */ ExecutionEventListener $this_dispatchEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(q qVar, ExecutionEventListener executionEventListener, Object obj, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$block = qVar;
            this.$this_dispatchEvent = executionEventListener;
            this.$snapshotData = obj;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$block, this.$this_dispatchEvent, this.$snapshotData, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                q qVar = this.$block;
                ExecutionEventListener executionEventListener = this.$this_dispatchEvent;
                Object obj2 = this.$snapshotData;
                this.label = 1;
                if (qVar.invoke(executionEventListener, obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.ListenerEventDispatchKt$dispatchEvent$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ r $block;
        final /* synthetic */ Object $snapshotData1;
        final /* synthetic */ Object $snapshotData2;
        final /* synthetic */ ExecutionEventListener $this_dispatchEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(r rVar, ExecutionEventListener executionEventListener, Object obj, Object obj2, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$block = rVar;
            this.$this_dispatchEvent = executionEventListener;
            this.$snapshotData1 = obj;
            this.$snapshotData2 = obj2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass2(this.$block, this.$this_dispatchEvent, this.$snapshotData1, this.$snapshotData2, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                r rVar = this.$block;
                ExecutionEventListener executionEventListener = this.$this_dispatchEvent;
                Object obj2 = this.$snapshotData1;
                Object obj3 = this.$snapshotData2;
                this.label = 1;
                if (rVar.invoke(executionEventListener, obj2, obj3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.ListenerEventDispatchKt$dispatchEvent$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ q $block;
        final /* synthetic */ Object $snapshotData;
        final /* synthetic */ ScheduleEventListener $this_dispatchEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(q qVar, ScheduleEventListener scheduleEventListener, Object obj, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$block = qVar;
            this.$this_dispatchEvent = scheduleEventListener;
            this.$snapshotData = obj;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass3(this.$block, this.$this_dispatchEvent, this.$snapshotData, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                q qVar = this.$block;
                ScheduleEventListener scheduleEventListener = this.$this_dispatchEvent;
                Object obj2 = this.$snapshotData;
                this.label = 1;
                if (qVar.invoke(scheduleEventListener, obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.ListenerEventDispatchKt$dispatchEvent$4, reason: invalid class name */
    final class AnonymousClass4 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ r $block;
        final /* synthetic */ Object $snapshotData1;
        final /* synthetic */ Object $snapshotData2;
        final /* synthetic */ ScheduleEventListener $this_dispatchEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(r rVar, ScheduleEventListener scheduleEventListener, Object obj, Object obj2, e<? super AnonymousClass4> eVar) {
            super(2, eVar);
            this.$block = rVar;
            this.$this_dispatchEvent = scheduleEventListener;
            this.$snapshotData1 = obj;
            this.$snapshotData2 = obj2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass4(this.$block, this.$this_dispatchEvent, this.$snapshotData1, this.$snapshotData2, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass4) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                r rVar = this.$block;
                ScheduleEventListener scheduleEventListener = this.$this_dispatchEvent;
                Object obj2 = this.$snapshotData1;
                Object obj3 = this.$snapshotData2;
                this.label = 1;
                if (rVar.invoke(scheduleEventListener, obj2, obj3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.ListenerEventDispatchKt$dispatchEvents$1, reason: invalid class name and case insensitive filesystem */
    final class C04821 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ q $block;
        final /* synthetic */ List $snapshotData;
        final /* synthetic */ ScheduleEventListener $this_dispatchEvents;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04821(List list, q qVar, ScheduleEventListener scheduleEventListener, e<? super C04821> eVar) {
            super(2, eVar);
            this.$snapshotData = list;
            this.$block = qVar;
            this.$this_dispatchEvents = scheduleEventListener;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C04821(this.$snapshotData, this.$block, this.$this_dispatchEvents, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C04821) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                it = this.$snapshotData.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$0;
                c.b(obj);
            }
            while (it.hasNext()) {
                Object next = it.next();
                q qVar = this.$block;
                ScheduleEventListener scheduleEventListener = this.$this_dispatchEvents;
                this.L$0 = it;
                this.label = 1;
                if (qVar.invoke(scheduleEventListener, next, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
    }

    public static final <T1, T2> void dispatchEvent(ExecutionEventListener executionEventListener, TaskExecutor taskExecutor, T1 t1, T2 t2, r<? super ExecutionEventListener, ? super T1, ? super T2, ? super e<? super ab>, ? extends Object> rVar) {
        x.f(executionEventListener, "<this>");
        x.f(taskExecutor, "taskExecutor");
        x.f(rVar, "block");
        af coroutineScope = taskExecutor.getCoroutineScope();
        x.e(coroutineScope, "getCoroutineScope(...)");
        kotlinx.coroutines.ab eventListenerDispatcher = taskExecutor.getEventListenerDispatcher();
        x.e(eventListenerDispatcher, "getEventListenerDispatcher(...)");
        aj.z(coroutineScope, eventListenerDispatcher, null, new AnonymousClass2(rVar, executionEventListener, t1, t2, null), 2);
    }

    public static final <T> void dispatchEvents(ScheduleEventListener scheduleEventListener, TaskExecutor taskExecutor, List<? extends T> list, q<? super ScheduleEventListener, ? super T, ? super e<? super ab>, ? extends Object> qVar) {
        x.f(scheduleEventListener, "<this>");
        x.f(taskExecutor, "taskExecutor");
        x.f(list, "snapshotData");
        x.f(qVar, "block");
        af coroutineScope = taskExecutor.getCoroutineScope();
        x.e(coroutineScope, "getCoroutineScope(...)");
        kotlinx.coroutines.ab eventListenerDispatcher = taskExecutor.getEventListenerDispatcher();
        x.e(eventListenerDispatcher, "getEventListenerDispatcher(...)");
        aj.z(coroutineScope, eventListenerDispatcher, null, new C04821(list, qVar, scheduleEventListener, null), 2);
    }

    public static final <T> void dispatchEvent(ExecutionEventListener executionEventListener, TaskExecutor taskExecutor, T t, q<? super ExecutionEventListener, ? super T, ? super e<? super ab>, ? extends Object> qVar) {
        x.f(executionEventListener, "<this>");
        x.f(taskExecutor, "taskExecutor");
        x.f(qVar, "block");
        af coroutineScope = taskExecutor.getCoroutineScope();
        x.e(coroutineScope, "getCoroutineScope(...)");
        kotlinx.coroutines.ab eventListenerDispatcher = taskExecutor.getEventListenerDispatcher();
        x.e(eventListenerDispatcher, "getEventListenerDispatcher(...)");
        aj.z(coroutineScope, eventListenerDispatcher, null, new AnonymousClass1(qVar, executionEventListener, t, null), 2);
    }

    public static final <T1, T2> void dispatchEvent(ScheduleEventListener scheduleEventListener, TaskExecutor taskExecutor, T1 t1, T2 t2, r<? super ScheduleEventListener, ? super T1, ? super T2, ? super e<? super ab>, ? extends Object> rVar) {
        x.f(scheduleEventListener, "<this>");
        x.f(taskExecutor, "taskExecutor");
        x.f(rVar, "block");
        af coroutineScope = taskExecutor.getCoroutineScope();
        x.e(coroutineScope, "getCoroutineScope(...)");
        kotlinx.coroutines.ab eventListenerDispatcher = taskExecutor.getEventListenerDispatcher();
        x.e(eventListenerDispatcher, "getEventListenerDispatcher(...)");
        aj.z(coroutineScope, eventListenerDispatcher, null, new AnonymousClass4(rVar, scheduleEventListener, t1, t2, null), 2);
    }

    public static final <T> void dispatchEvent(ScheduleEventListener scheduleEventListener, TaskExecutor taskExecutor, T t, q<? super ScheduleEventListener, ? super T, ? super e<? super ab>, ? extends Object> qVar) {
        x.f(scheduleEventListener, "<this>");
        x.f(taskExecutor, "taskExecutor");
        x.f(qVar, "block");
        af coroutineScope = taskExecutor.getCoroutineScope();
        x.e(coroutineScope, "getCoroutineScope(...)");
        kotlinx.coroutines.ab eventListenerDispatcher = taskExecutor.getEventListenerDispatcher();
        x.e(eventListenerDispatcher, "getEventListenerDispatcher(...)");
        aj.z(coroutineScope, eventListenerDispatcher, null, new AnonymousClass3(qVar, scheduleEventListener, t, null), 2);
    }
}
