package androidx.work.impl.model;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import h.a.i;
import h.c.a.a;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name";

    public static final k<List<WorkInfo>> dedup(final k<? extends List<WorkSpec.WorkInfoPojo>> kVar, ab abVar) {
        x.f(kVar, "<this>");
        x.f(abVar, "dispatcher");
        return ai.H(ai.y(new k<List<? extends WorkInfo>>() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements l {
                final /* synthetic */ l $this_unsafeFlow;

                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(l lVar) {
                    this.$this_unsafeFlow = lVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r6)
                        goto L6b
                    L27:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L2f:
                        e.b.c.b(r6)
                        kotlinx.coroutines.b.l r4 = r4.$this_unsafeFlow
                        r6 = r0
                        h.c.e r6 = (h.c.e) r6
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r6 = new java.util.ArrayList
                        r2 = 10
                        int r2 = h.a.i.q(r5, r2)
                        r6.<init>(r2)
                        java.util.Collection r6 = (java.util.Collection) r6
                        java.util.Iterator r5 = r5.iterator()
                    L4c:
                        boolean r2 = r5.hasNext()
                        if (r2 == 0) goto L60
                        java.lang.Object r2 = r5.next()
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r2 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r2
                        androidx.work.WorkInfo r2 = r2.toWorkInfo()
                        r6.add(r2)
                        goto L4c
                    L60:
                        java.util.List r6 = (java.util.List) r6
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r6, r0)
                        if (r4 != r1) goto L6b
                        return r1
                    L6b:
                        h.ab r4 = h.ab.f48028a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(l<? super List<? extends WorkInfo>> lVar, e eVar) {
                Object objCollect = kVar.collect(new AnonymousClass2(lVar), eVar);
                return objCollect == a.f48038a ? objCollect : h.ab.f48028a;
            }
        }), abVar);
    }

    public static final WorkInfo getWorkInfo(WorkSpecDao workSpecDao, String str) {
        x.f(workSpecDao, "<this>");
        x.f(str, TtmlNode.ATTR_ID);
        WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(str);
        if (workStatusPojoForId != null) {
            return workStatusPojoForId.toWorkInfo();
        }
        return null;
    }

    public static final List<WorkInfo> getWorkInfos(WorkSpecDao workSpecDao, List<String> list) {
        x.f(workSpecDao, "<this>");
        x.f(list, "ids");
        List<WorkSpec.WorkInfoPojo> workStatusPojoForIds = workSpecDao.getWorkStatusPojoForIds(list);
        ArrayList arrayList = new ArrayList(i.q(workStatusPojoForIds, 10));
        Iterator<T> it = workStatusPojoForIds.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkSpec.WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public static final k<WorkInfo> getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID uuid) {
        x.f(workSpecDao, "<this>");
        x.f(uuid, TtmlNode.ATTR_ID);
        final k<List<WorkSpec.WorkInfoPojo>> workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(i.d(String.valueOf(uuid)));
        return ai.y(new k<WorkInfo>() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements l {
                final /* synthetic */ l $this_unsafeFlow;

                /* renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(l lVar) {
                    this.$this_unsafeFlow = lVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        e.b.c.b(r6)
                        goto L50
                    L27:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L2f:
                        e.b.c.b(r6)
                        kotlinx.coroutines.b.l r4 = r4.$this_unsafeFlow
                        r6 = r0
                        h.c.e r6 = (h.c.e) r6
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = h.a.i.R(r5)
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r5 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r5
                        if (r5 == 0) goto L46
                        androidx.work.WorkInfo r5 = r5.toWorkInfo()
                        goto L47
                    L46:
                        r5 = 0
                    L47:
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L50
                        return r1
                    L50:
                        h.ab r4 = h.ab.f48028a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(l<? super WorkInfo> lVar, e eVar) {
                Object objCollect = workStatusPojoFlowDataForIds.collect(new AnonymousClass2(lVar), eVar);
                return objCollect == a.f48038a ? objCollect : h.ab.f48028a;
            }
        });
    }

    public static final k<List<WorkInfo>> getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, ab abVar, String str) {
        x.f(workSpecDao, "<this>");
        x.f(abVar, "dispatcher");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(str), abVar);
    }

    public static final k<List<WorkInfo>> getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, ab abVar, String str) {
        x.f(workSpecDao, "<this>");
        x.f(abVar, "dispatcher");
        x.f(str, "tag");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(str), abVar);
    }
}
