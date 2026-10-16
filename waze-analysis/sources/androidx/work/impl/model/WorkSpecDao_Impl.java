package androidx.work.impl.model;

import androidx.autofill.HintConstants;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {
    public static final Companion Companion = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<WorkSpec> __insertAdapterOfWorkSpec;
    private final EntityDeleteOrUpdateAdapter<WorkSpec> __updateAdapterOfWorkSpec;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        x.f(roomDatabase, "__db");
        this.__db = roomDatabase;
        this.__insertAdapterOfWorkSpec = new EntityInsertAdapter<WorkSpec>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement sQLiteStatement, WorkSpec workSpec) {
                x.f(sQLiteStatement, "statement");
                x.f(workSpec, "entity");
                sQLiteStatement.mo13248bindText(1, workSpec.id);
                sQLiteStatement.mo13246bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                sQLiteStatement.mo13248bindText(3, workSpec.workerClassName);
                sQLiteStatement.mo13248bindText(4, workSpec.inputMergerClassName);
                sQLiteStatement.mo13244bindBlob(5, Data.Companion.toByteArrayInternalV1(workSpec.input));
                sQLiteStatement.mo13244bindBlob(6, Data.Companion.toByteArrayInternalV1(workSpec.output));
                sQLiteStatement.mo13246bindLong(7, workSpec.initialDelay);
                sQLiteStatement.mo13246bindLong(8, workSpec.intervalDuration);
                sQLiteStatement.mo13246bindLong(9, workSpec.flexDuration);
                sQLiteStatement.mo13246bindLong(10, workSpec.runAttemptCount);
                sQLiteStatement.mo13246bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                sQLiteStatement.mo13246bindLong(12, workSpec.backoffDelayDuration);
                sQLiteStatement.mo13246bindLong(13, workSpec.lastEnqueueTime);
                sQLiteStatement.mo13246bindLong(14, workSpec.minimumRetentionDuration);
                sQLiteStatement.mo13246bindLong(15, workSpec.scheduleRequestedAt);
                sQLiteStatement.mo13246bindLong(16, workSpec.expedited ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                sQLiteStatement.mo13246bindLong(18, workSpec.getPeriodCount());
                sQLiteStatement.mo13246bindLong(19, workSpec.getGeneration());
                sQLiteStatement.mo13246bindLong(20, workSpec.getNextScheduleTimeOverride());
                sQLiteStatement.mo13246bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
                sQLiteStatement.mo13246bindLong(22, workSpec.getStopReason());
                String traceTag = workSpec.getTraceTag();
                if (traceTag == null) {
                    sQLiteStatement.mo13247bindNull(23);
                } else {
                    sQLiteStatement.mo13248bindText(23, traceTag);
                }
                Boolean backOffOnSystemInterruptions = workSpec.getBackOffOnSystemInterruptions();
                if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.mo13247bindNull(24);
                } else {
                    sQLiteStatement.mo13246bindLong(24, r3.intValue());
                }
                Constraints constraints = workSpec.constraints;
                sQLiteStatement.mo13246bindLong(25, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                sQLiteStatement.mo13244bindBlob(26, WorkTypeConverters.fromNetworkRequest$work_runtime(constraints.getRequiredNetworkRequestCompat$work_runtime()));
                sQLiteStatement.mo13246bindLong(27, constraints.requiresCharging() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(28, constraints.requiresDeviceIdle() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(29, constraints.requiresBatteryNotLow() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(30, constraints.requiresStorageNotLow() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(31, constraints.getContentTriggerUpdateDelayMillis());
                sQLiteStatement.mo13246bindLong(32, constraints.getContentTriggerMaxDelayMillis());
                sQLiteStatement.mo13244bindBlob(33, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
            }

            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.__updateAdapterOfWorkSpec = new EntityDeleteOrUpdateAdapter<WorkSpec>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement sQLiteStatement, WorkSpec workSpec) {
                x.f(sQLiteStatement, "statement");
                x.f(workSpec, "entity");
                sQLiteStatement.mo13248bindText(1, workSpec.id);
                sQLiteStatement.mo13246bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                sQLiteStatement.mo13248bindText(3, workSpec.workerClassName);
                sQLiteStatement.mo13248bindText(4, workSpec.inputMergerClassName);
                sQLiteStatement.mo13244bindBlob(5, Data.Companion.toByteArrayInternalV1(workSpec.input));
                sQLiteStatement.mo13244bindBlob(6, Data.Companion.toByteArrayInternalV1(workSpec.output));
                sQLiteStatement.mo13246bindLong(7, workSpec.initialDelay);
                sQLiteStatement.mo13246bindLong(8, workSpec.intervalDuration);
                sQLiteStatement.mo13246bindLong(9, workSpec.flexDuration);
                sQLiteStatement.mo13246bindLong(10, workSpec.runAttemptCount);
                sQLiteStatement.mo13246bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                sQLiteStatement.mo13246bindLong(12, workSpec.backoffDelayDuration);
                sQLiteStatement.mo13246bindLong(13, workSpec.lastEnqueueTime);
                sQLiteStatement.mo13246bindLong(14, workSpec.minimumRetentionDuration);
                sQLiteStatement.mo13246bindLong(15, workSpec.scheduleRequestedAt);
                sQLiteStatement.mo13246bindLong(16, workSpec.expedited ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                sQLiteStatement.mo13246bindLong(18, workSpec.getPeriodCount());
                sQLiteStatement.mo13246bindLong(19, workSpec.getGeneration());
                sQLiteStatement.mo13246bindLong(20, workSpec.getNextScheduleTimeOverride());
                sQLiteStatement.mo13246bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
                sQLiteStatement.mo13246bindLong(22, workSpec.getStopReason());
                String traceTag = workSpec.getTraceTag();
                if (traceTag == null) {
                    sQLiteStatement.mo13247bindNull(23);
                } else {
                    sQLiteStatement.mo13248bindText(23, traceTag);
                }
                Boolean backOffOnSystemInterruptions = workSpec.getBackOffOnSystemInterruptions();
                if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                    sQLiteStatement.mo13247bindNull(24);
                } else {
                    sQLiteStatement.mo13246bindLong(24, r3.intValue());
                }
                Constraints constraints = workSpec.constraints;
                sQLiteStatement.mo13246bindLong(25, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                sQLiteStatement.mo13244bindBlob(26, WorkTypeConverters.fromNetworkRequest$work_runtime(constraints.getRequiredNetworkRequestCompat$work_runtime()));
                sQLiteStatement.mo13246bindLong(27, constraints.requiresCharging() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(28, constraints.requiresDeviceIdle() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(29, constraints.requiresBatteryNotLow() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(30, constraints.requiresStorageNotLow() ? 1L : 0L);
                sQLiteStatement.mo13246bindLong(31, constraints.getContentTriggerUpdateDelayMillis());
                sQLiteStatement.mo13246bindLong(32, constraints.getContentTriggerMaxDelayMillis());
                sQLiteStatement.mo13244bindBlob(33, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
                sQLiteStatement.mo13248bindText(34, workSpec.id);
            }

            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }
        };
    }

    private final void __fetchRelationshipWorkProgressAsandroidxWorkData(final SQLiteConnection sQLiteConnection, ArrayMap<String, List<Data>> arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.size() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda42
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return WorkSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(this.f$0, sQLiteConnection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string = sb.toString();
        x.e(string, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(string);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo13248bindText(i2, it.next());
            i2++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    List<Data> list = arrayMap.get(sQLiteStatementPrepare.getText(columnIndex));
                    if (list != null) {
                        list.add(Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(0)));
                    }
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        x.f(arrayMap, "_tmpMap");
        workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap);
        return ab.f48028a;
    }

    private final void __fetchRelationshipWorkTagAsjavaLangString(final SQLiteConnection sQLiteConnection, ArrayMap<String, List<String>> arrayMap) {
        Set<String> setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.size() > 999) {
            RelationUtil.recursiveFetchArrayMap(arrayMap, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda44
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return WorkSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString$lambda$0(this.f$0, sQLiteConnection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(")");
        String string = sb.toString();
        x.e(string, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(string);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo13248bindText(i2, it.next());
            i2++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex != -1) {
                while (sQLiteStatementPrepare.step()) {
                    List<String> list = arrayMap.get(sQLiteStatementPrepare.getText(columnIndex));
                    if (list != null) {
                        list.add(sQLiteStatementPrepare.getText(0));
                    }
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab __fetchRelationshipWorkTagAsjavaLangString$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        x.f(arrayMap, "_tmpMap");
        workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
        return ab.f48028a;
    }

    static final int countNonFinishedContentUriTriggerWorkers$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            return sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab delete$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final List getAllEligibleWorkSpecsForScheduling$lambda$0(String str, int i2, SQLiteConnection sQLiteConnection) {
        int i3;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i4 = columnIndexOrThrow13;
                int i5 = columnIndexOrThrow14;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i7 = columnIndexOrThrow;
                int i8 = columnIndexOrThrow2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(i4);
                long j7 = sQLiteStatementPrepare.getLong(i5);
                int i9 = columnIndexOrThrow15;
                long j8 = sQLiteStatementPrepare.getLong(i9);
                columnIndexOrThrow15 = i9;
                int i10 = columnIndexOrThrow16;
                int i11 = columnIndexOrThrow3;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i10)) != 0;
                int i12 = columnIndexOrThrow17;
                int i13 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i12));
                int i14 = columnIndexOrThrow18;
                int i15 = (int) sQLiteStatementPrepare.getLong(i14);
                int i16 = columnIndexOrThrow19;
                int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                int i18 = columnIndexOrThrow20;
                long j9 = sQLiteStatementPrepare.getLong(i18);
                int i19 = columnIndexOrThrow21;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                columnIndexOrThrow21 = i19;
                int i21 = columnIndexOrThrow22;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23);
                int i24 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i3 = i23;
                    columnIndexOrThrow22 = i21;
                    numValueOf = null;
                } else {
                    i3 = i23;
                    columnIndexOrThrow22 = i21;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i25 = columnIndexOrThrow25;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i26));
                int i27 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                int i29 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                columnIndexOrThrow29 = i29;
                int i30 = columnIndexOrThrow30;
                int i31 = columnIndexOrThrow31;
                int i32 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i31;
                int i33 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i30)) != 0, sQLiteStatementPrepare.getLong(i31), sQLiteStatementPrepare.getLong(i32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i33))), i6, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j9, i20, i22, text4, bool));
                columnIndexOrThrow28 = i28;
                columnIndexOrThrow4 = i13;
                columnIndexOrThrow17 = i12;
                columnIndexOrThrow18 = i14;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow23 = i3;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow25 = i25;
                columnIndexOrThrow26 = i26;
                columnIndexOrThrow27 = i27;
                columnIndexOrThrow33 = i33;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow = i7;
                columnIndexOrThrow13 = i4;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow2 = i8;
                columnIndexOrThrow3 = i11;
                columnIndexOrThrow16 = i10;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getAllUnblockedWork$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        int i2;
        int i3;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow2;
                int i7 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j7 = sQLiteStatementPrepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j8 = sQLiteStatementPrepare.getLong(i8);
                int i9 = columnIndexOrThrow;
                int i10 = columnIndexOrThrow16;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i10)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = columnIndexOrThrow5;
                int i15 = (int) sQLiteStatementPrepare.getLong(i13);
                int i16 = columnIndexOrThrow19;
                int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                int i18 = columnIndexOrThrow20;
                long j9 = sQLiteStatementPrepare.getLong(i18);
                int i19 = columnIndexOrThrow21;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                int i21 = columnIndexOrThrow22;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23);
                int i24 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = null;
                } else {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i25 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i26));
                columnIndexOrThrow25 = i25;
                columnIndexOrThrow26 = i26;
                int i27 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                columnIndexOrThrow27 = i27;
                int i28 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                int i29 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                columnIndexOrThrow29 = i29;
                int i30 = columnIndexOrThrow30;
                int i31 = columnIndexOrThrow31;
                int i32 = columnIndexOrThrow32;
                int i33 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i33;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i30)) != 0, sQLiteStatementPrepare.getLong(i31), sQLiteStatementPrepare.getLong(i32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i33))), i5, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j9, i2, i22, text4, bool));
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow22 = i3;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow31 = i31;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow3 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow21 = i19;
                columnIndexOrThrow23 = i23;
                columnIndexOrThrow28 = i28;
                columnIndexOrThrow5 = i14;
                columnIndexOrThrow18 = i13;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getAllUnfinishedWork$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getAllWorkSpecIds$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getAllWorkSpecIdsLiveData$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getEligibleWorkForScheduling$lambda$0(String str, int i2, SQLiteConnection sQLiteConnection) {
        int i3;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i4 = columnIndexOrThrow13;
                int i5 = columnIndexOrThrow14;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i7 = columnIndexOrThrow;
                int i8 = columnIndexOrThrow2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(i4);
                long j7 = sQLiteStatementPrepare.getLong(i5);
                int i9 = columnIndexOrThrow15;
                long j8 = sQLiteStatementPrepare.getLong(i9);
                columnIndexOrThrow15 = i9;
                int i10 = columnIndexOrThrow16;
                int i11 = columnIndexOrThrow3;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i10)) != 0;
                int i12 = columnIndexOrThrow17;
                int i13 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i12));
                int i14 = columnIndexOrThrow18;
                int i15 = (int) sQLiteStatementPrepare.getLong(i14);
                int i16 = columnIndexOrThrow19;
                int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                int i18 = columnIndexOrThrow20;
                long j9 = sQLiteStatementPrepare.getLong(i18);
                int i19 = columnIndexOrThrow21;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                columnIndexOrThrow21 = i19;
                int i21 = columnIndexOrThrow22;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23);
                int i24 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i3 = i23;
                    columnIndexOrThrow22 = i21;
                    numValueOf = null;
                } else {
                    i3 = i23;
                    columnIndexOrThrow22 = i21;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i25 = columnIndexOrThrow25;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i26));
                int i27 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                int i29 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                columnIndexOrThrow29 = i29;
                int i30 = columnIndexOrThrow30;
                int i31 = columnIndexOrThrow31;
                int i32 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i31;
                int i33 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i30)) != 0, sQLiteStatementPrepare.getLong(i31), sQLiteStatementPrepare.getLong(i32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i33))), i6, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j9, i20, i22, text4, bool));
                columnIndexOrThrow28 = i28;
                columnIndexOrThrow4 = i13;
                columnIndexOrThrow17 = i12;
                columnIndexOrThrow18 = i14;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow23 = i3;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow25 = i25;
                columnIndexOrThrow26 = i26;
                columnIndexOrThrow27 = i27;
                columnIndexOrThrow33 = i33;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow = i7;
                columnIndexOrThrow13 = i4;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow2 = i8;
                columnIndexOrThrow3 = i11;
                columnIndexOrThrow16 = i10;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getEligibleWorkForSchedulingWithContentUris$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        int i2;
        int i3;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow2;
                int i7 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j7 = sQLiteStatementPrepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j8 = sQLiteStatementPrepare.getLong(i8);
                int i9 = columnIndexOrThrow;
                int i10 = columnIndexOrThrow16;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i10)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = columnIndexOrThrow5;
                int i15 = (int) sQLiteStatementPrepare.getLong(i13);
                int i16 = columnIndexOrThrow19;
                int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                int i18 = columnIndexOrThrow20;
                long j9 = sQLiteStatementPrepare.getLong(i18);
                int i19 = columnIndexOrThrow21;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                int i21 = columnIndexOrThrow22;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23);
                int i24 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = null;
                } else {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i25 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i26));
                columnIndexOrThrow25 = i25;
                columnIndexOrThrow26 = i26;
                int i27 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                columnIndexOrThrow27 = i27;
                int i28 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                int i29 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                columnIndexOrThrow29 = i29;
                int i30 = columnIndexOrThrow30;
                int i31 = columnIndexOrThrow31;
                int i32 = columnIndexOrThrow32;
                int i33 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i33;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i30)) != 0, sQLiteStatementPrepare.getLong(i31), sQLiteStatementPrepare.getLong(i32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i33))), i5, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j9, i2, i22, text4, bool));
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow22 = i3;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow31 = i31;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow3 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow21 = i19;
                columnIndexOrThrow23 = i23;
                columnIndexOrThrow28 = i28;
                columnIndexOrThrow5 = i14;
                columnIndexOrThrow18 = i13;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getInputsFromPrerequisites$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(0)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getRecentlyCompletedWork$lambda$0(String str, long j2, SQLiteConnection sQLiteConnection) {
        int i2;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i3 = columnIndexOrThrow13;
                int i4 = columnIndexOrThrow14;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow;
                int i7 = columnIndexOrThrow2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j7 = sQLiteStatementPrepare.getLong(i3);
                long j8 = sQLiteStatementPrepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j9 = sQLiteStatementPrepare.getLong(i8);
                columnIndexOrThrow15 = i8;
                int i9 = columnIndexOrThrow16;
                int i10 = columnIndexOrThrow3;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i9)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = (int) sQLiteStatementPrepare.getLong(i13);
                int i15 = columnIndexOrThrow19;
                int i16 = (int) sQLiteStatementPrepare.getLong(i15);
                int i17 = columnIndexOrThrow20;
                long j10 = sQLiteStatementPrepare.getLong(i17);
                int i18 = columnIndexOrThrow21;
                int i19 = (int) sQLiteStatementPrepare.getLong(i18);
                columnIndexOrThrow21 = i18;
                int i20 = columnIndexOrThrow22;
                int i21 = (int) sQLiteStatementPrepare.getLong(i20);
                int i22 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22);
                int i23 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i2 = i22;
                    columnIndexOrThrow22 = i20;
                    numValueOf = null;
                } else {
                    i2 = i22;
                    columnIndexOrThrow22 = i20;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i23));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i24 = columnIndexOrThrow25;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i24));
                int i25 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i25));
                int i26 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i26)) != 0;
                int i27 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                columnIndexOrThrow29 = i28;
                int i29 = columnIndexOrThrow30;
                int i30 = columnIndexOrThrow31;
                int i31 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i30;
                int i32 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j3, j4, j5, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i29)) != 0, sQLiteStatementPrepare.getLong(i30), sQLiteStatementPrepare.getLong(i31), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i32))), i5, backoffPolicyIntToBackoffPolicy, j6, j7, j8, j9, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i14, i16, j10, i19, i21, text4, bool));
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow20 = i17;
                columnIndexOrThrow23 = i2;
                columnIndexOrThrow24 = i23;
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                columnIndexOrThrow27 = i26;
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow33 = i32;
                columnIndexOrThrow32 = i31;
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow = i6;
                columnIndexOrThrow13 = i3;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow2 = i7;
                columnIndexOrThrow3 = i10;
                columnIndexOrThrow16 = i9;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getRunningWork$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        int i2;
        int i3;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow2;
                int i7 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j7 = sQLiteStatementPrepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j8 = sQLiteStatementPrepare.getLong(i8);
                int i9 = columnIndexOrThrow;
                int i10 = columnIndexOrThrow16;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i10)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = columnIndexOrThrow5;
                int i15 = (int) sQLiteStatementPrepare.getLong(i13);
                int i16 = columnIndexOrThrow19;
                int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                int i18 = columnIndexOrThrow20;
                long j9 = sQLiteStatementPrepare.getLong(i18);
                int i19 = columnIndexOrThrow21;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                int i21 = columnIndexOrThrow22;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23);
                int i24 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = null;
                } else {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i25 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i26));
                columnIndexOrThrow25 = i25;
                columnIndexOrThrow26 = i26;
                int i27 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                columnIndexOrThrow27 = i27;
                int i28 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                int i29 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                columnIndexOrThrow29 = i29;
                int i30 = columnIndexOrThrow30;
                int i31 = columnIndexOrThrow31;
                int i32 = columnIndexOrThrow32;
                int i33 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i33;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i30)) != 0, sQLiteStatementPrepare.getLong(i31), sQLiteStatementPrepare.getLong(i32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i33))), i5, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j9, i2, i22, text4, bool));
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow22 = i3;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow31 = i31;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow3 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow21 = i19;
                columnIndexOrThrow23 = i23;
                columnIndexOrThrow28 = i28;
                columnIndexOrThrow5 = i14;
                columnIndexOrThrow18 = i13;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final Long getScheduleRequestedAtLiveData$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            Long lValueOf = null;
            if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                lValueOf = Long.valueOf(sQLiteStatementPrepare.getLong(0));
            }
            return lValueOf;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getScheduledWork$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        int i2;
        int i3;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow2;
                int i7 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j7 = sQLiteStatementPrepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j8 = sQLiteStatementPrepare.getLong(i8);
                int i9 = columnIndexOrThrow;
                int i10 = columnIndexOrThrow16;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i10)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = columnIndexOrThrow5;
                int i15 = (int) sQLiteStatementPrepare.getLong(i13);
                int i16 = columnIndexOrThrow19;
                int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                int i18 = columnIndexOrThrow20;
                long j9 = sQLiteStatementPrepare.getLong(i18);
                int i19 = columnIndexOrThrow21;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                int i21 = columnIndexOrThrow22;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23);
                int i24 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = null;
                } else {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i25 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i26));
                columnIndexOrThrow25 = i25;
                columnIndexOrThrow26 = i26;
                int i27 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                columnIndexOrThrow27 = i27;
                int i28 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                int i29 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                columnIndexOrThrow29 = i29;
                int i30 = columnIndexOrThrow30;
                int i31 = columnIndexOrThrow31;
                int i32 = columnIndexOrThrow32;
                int i33 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i33;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i30)) != 0, sQLiteStatementPrepare.getLong(i31), sQLiteStatementPrepare.getLong(i32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i33))), i5, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j9, i2, i22, text4, bool));
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow22 = i3;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow31 = i31;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow3 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow21 = i19;
                columnIndexOrThrow23 = i23;
                columnIndexOrThrow28 = i28;
                columnIndexOrThrow5 = i14;
                columnIndexOrThrow18 = i13;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getScheduledWorkWithContentUris$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        int i2;
        int i3;
        Integer numValueOf;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                int i4 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow2;
                int i7 = columnIndexOrThrow3;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j7 = sQLiteStatementPrepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j8 = sQLiteStatementPrepare.getLong(i8);
                int i9 = columnIndexOrThrow;
                int i10 = columnIndexOrThrow16;
                boolean z = ((int) sQLiteStatementPrepare.getLong(i10)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = columnIndexOrThrow5;
                int i15 = (int) sQLiteStatementPrepare.getLong(i13);
                int i16 = columnIndexOrThrow19;
                int i17 = (int) sQLiteStatementPrepare.getLong(i16);
                int i18 = columnIndexOrThrow20;
                long j9 = sQLiteStatementPrepare.getLong(i18);
                int i19 = columnIndexOrThrow21;
                int i20 = (int) sQLiteStatementPrepare.getLong(i19);
                int i21 = columnIndexOrThrow22;
                int i22 = (int) sQLiteStatementPrepare.getLong(i21);
                int i23 = columnIndexOrThrow23;
                Boolean boolValueOf = null;
                String text4 = sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23);
                int i24 = columnIndexOrThrow24;
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = null;
                } else {
                    i2 = i20;
                    i3 = i21;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i24));
                }
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i25 = columnIndexOrThrow25;
                Boolean bool = boolValueOf;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i25));
                int i26 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime = WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(i26));
                columnIndexOrThrow25 = i25;
                columnIndexOrThrow26 = i26;
                int i27 = columnIndexOrThrow27;
                boolean z2 = ((int) sQLiteStatementPrepare.getLong(i27)) != 0;
                columnIndexOrThrow27 = i27;
                int i28 = columnIndexOrThrow28;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(i28)) != 0;
                int i29 = columnIndexOrThrow29;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(i29)) != 0;
                columnIndexOrThrow29 = i29;
                int i30 = columnIndexOrThrow30;
                int i31 = columnIndexOrThrow31;
                int i32 = columnIndexOrThrow32;
                int i33 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i33;
                arrayList2.add(new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime, networkTypeIntToNetworkType, z2, z3, z4, ((int) sQLiteStatementPrepare.getLong(i30)) != 0, sQLiteStatementPrepare.getLong(i31), sQLiteStatementPrepare.getLong(i32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i33))), i5, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j9, i2, i22, text4, bool));
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow19 = i16;
                columnIndexOrThrow22 = i3;
                columnIndexOrThrow24 = i24;
                columnIndexOrThrow31 = i31;
                columnIndexOrThrow32 = i32;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow3 = i7;
                arrayList = arrayList2;
                columnIndexOrThrow = i9;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow20 = i18;
                columnIndexOrThrow21 = i19;
                columnIndexOrThrow23 = i23;
                columnIndexOrThrow28 = i28;
                columnIndexOrThrow5 = i14;
                columnIndexOrThrow18 = i13;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final WorkInfo.State getState$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            WorkInfo.State stateIntToState = null;
            if (sQLiteStatementPrepare.step()) {
                Integer numValueOf = sQLiteStatementPrepare.isNull(0) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
                if (numValueOf != null) {
                    stateIntToState = WorkTypeConverters.intToState(numValueOf.intValue());
                }
            }
            return stateIntToState;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getUnfinishedWorkWithName$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getUnfinishedWorkWithTag$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final WorkSpec getWorkSpec$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, TtmlNode.ATTR_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, DownloadService.KEY_STOP_REASON);
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content_uri_triggers");
            WorkSpec workSpec = null;
            Boolean boolValueOf = null;
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                String text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow5));
                Data dataFromByteArray2 = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndexOrThrow6));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                long j6 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                long j7 = sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                long j8 = sQLiteStatementPrepare.getLong(columnIndexOrThrow15);
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)) != 0;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17));
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow18);
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19);
                long j9 = sQLiteStatementPrepare.getLong(columnIndexOrThrow20);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow22);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow24));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                workSpec = new WorkSpec(text, stateIntToState, text2, text3, dataFromByteArray, dataFromByteArray2, j2, j3, j4, new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(columnIndexOrThrow26)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow25)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow28)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow29)) != 0, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow30)) != 0, sQLiteStatementPrepare.getLong(columnIndexOrThrow31), sQLiteStatementPrepare.getLong(columnIndexOrThrow32), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(columnIndexOrThrow33))), i2, backoffPolicyIntToBackoffPolicy, j5, j6, j7, j8, z, outOfQuotaPolicyIntToOutOfQuotaPolicy, i3, i4, j9, i5, i6, text4, boolValueOf);
            }
            return workSpec;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkSpecIdAndStatesForName$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new WorkSpec.IdAndState(sQLiteStatementPrepare.getText(0), WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(1))));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoFlowDataForIds$lambda$0(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i3 = 1;
            int i4 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo13248bindText(i4, (String) it.next());
                i4++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i5 = (int) sQLiteStatementPrepare.getLong(3);
                int i6 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i7 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i8 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list2 = (List) objH;
                Object objH2 = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i5, backoffPolicyIntToBackoffPolicy, j5, j6, i7, i6, j7, i8, list2, text4, (List) objH2));
                arrayMap2 = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoFlowForName$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i3 = 1;
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i4 = (int) sQLiteStatementPrepare.getLong(3);
                int i5 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i6 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i7 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list = (List) objH;
                Object objH2 = r.h(arrayMap2, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i4, backoffPolicyIntToBackoffPolicy, j5, j6, i6, i5, j7, i7, list, text4, (List) objH2));
                arrayMap = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoFlowForTag$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i3 = 1;
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i4 = (int) sQLiteStatementPrepare.getLong(3);
                int i5 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i6 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i7 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list = (List) objH;
                Object objH2 = r.h(arrayMap2, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i4, backoffPolicyIntToBackoffPolicy, j5, j6, i6, i5, j7, i7, list, text4, (List) objH2));
                arrayMap = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final WorkSpec.WorkInfoPojo getWorkStatusPojoForId$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        WorkSpec.WorkInfoPojo workInfoPojo;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            if (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(0);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(1));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i2 = (int) sQLiteStatementPrepare.getLong(3);
                int i3 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i4 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i5 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                Object objH2 = r.h(arrayMap2, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                workInfoPojo = new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i2, backoffPolicyIntToBackoffPolicy, j5, j6, i4, i3, j7, i5, (List) objH, text4, (List) objH2);
            } else {
                workInfoPojo = null;
            }
            return workInfoPojo;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoForIds$lambda$0(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i3 = 1;
            int i4 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo13248bindText(i4, (String) it.next());
                i4++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i5 = (int) sQLiteStatementPrepare.getLong(3);
                int i6 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i7 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i8 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list2 = (List) objH;
                Object objH2 = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i5, backoffPolicyIntToBackoffPolicy, j5, j6, i7, i6, j7, i8, list2, text4, (List) objH2));
                arrayMap2 = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoForName$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i3 = 1;
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i4 = (int) sQLiteStatementPrepare.getLong(3);
                int i5 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i6 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i7 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list = (List) objH;
                Object objH2 = r.h(arrayMap2, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i4, backoffPolicyIntToBackoffPolicy, j5, j6, i6, i5, j7, i7, list, text4, (List) objH2));
                arrayMap = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoForTag$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i3 = 1;
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i4 = (int) sQLiteStatementPrepare.getLong(3);
                int i5 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i6 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i7 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list = (List) objH;
                Object objH2 = r.h(arrayMap2, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i4, backoffPolicyIntToBackoffPolicy, j5, j6, i6, i5, j7, i7, list, text4, (List) objH2));
                arrayMap = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoLiveDataForIds$lambda$0(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i3 = 1;
            int i4 = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo13248bindText(i4, (String) it.next());
                i4++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i5 = (int) sQLiteStatementPrepare.getLong(3);
                int i6 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i7 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i8 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list2 = (List) objH;
                Object objH2 = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i5, backoffPolicyIntToBackoffPolicy, j5, j6, i7, i6, j7, i8, list2, text4, (List) objH2));
                arrayMap2 = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoLiveDataForName$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i3 = 1;
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i4 = (int) sQLiteStatementPrepare.getLong(3);
                int i5 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i6 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i7 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list = (List) objH;
                Object objH2 = r.h(arrayMap2, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i4, backoffPolicyIntToBackoffPolicy, j5, j6, i6, i5, j7, i7, list, text4, (List) objH2));
                arrayMap = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkStatusPojoLiveDataForTag$lambda$0(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection) {
        int i2;
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        int i3 = 1;
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i2 = 0;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                String text = sQLiteStatementPrepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            sQLiteStatementPrepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                String text3 = sQLiteStatementPrepare.getText(i2);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(i3));
                Data dataFromByteArray = Data.Companion.fromByteArray(sQLiteStatementPrepare.getBlob(2));
                int i4 = (int) sQLiteStatementPrepare.getLong(3);
                int i5 = (int) sQLiteStatementPrepare.getLong(4);
                long j2 = sQLiteStatementPrepare.getLong(14);
                long j3 = sQLiteStatementPrepare.getLong(15);
                long j4 = sQLiteStatementPrepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(17));
                long j5 = sQLiteStatementPrepare.getLong(18);
                long j6 = sQLiteStatementPrepare.getLong(19);
                int i6 = (int) sQLiteStatementPrepare.getLong(20);
                long j7 = sQLiteStatementPrepare.getLong(21);
                int i7 = (int) sQLiteStatementPrepare.getLong(22);
                String text4 = sQLiteStatementPrepare.getText(23);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime(sQLiteStatementPrepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(5)), ((int) sQLiteStatementPrepare.getLong(7)) != 0, ((int) sQLiteStatementPrepare.getLong(8)) != 0, ((int) sQLiteStatementPrepare.getLong(9)) != 0, ((int) sQLiteStatementPrepare.getLong(10)) != 0, sQLiteStatementPrepare.getLong(11), sQLiteStatementPrepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(13)));
                Object objH = r.h(arrayMap3, sQLiteStatementPrepare.getText(0));
                x.e(objH, "getValue(...)");
                List list = (List) objH;
                Object objH2 = r.h(arrayMap2, sQLiteStatementPrepare.getText(0));
                x.e(objH2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j2, j3, j4, constraints, i4, backoffPolicyIntToBackoffPolicy, j5, j6, i6, i5, j7, i7, list, text4, (List) objH2));
                arrayMap = arrayMap3;
                i3 = 1;
                i2 = 0;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final boolean hasUnfinishedWorkFlow$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            boolean z = false;
            if (sQLiteStatementPrepare.step()) {
                if (((int) sQLiteStatementPrepare.getLong(0)) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab incrementGeneration$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final ab incrementPeriodCount$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final int incrementWorkSpecRunAttemptCount$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab insertWorkSpec$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "_connection");
        workSpecDao_Impl.__insertAdapterOfWorkSpec.insert(sQLiteConnection, (SQLiteConnection) workSpec);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean isWorkSpecScheduled$lambda$0(java.lang.String r3, java.lang.String r4, androidx.sqlite.SQLiteConnection r5) {
        /*
            java.lang.String r0 = "_connection"
            h.g.b.x.f(r5, r0)
            androidx.sqlite.SQLiteStatement r3 = r5.prepare(r3)
            r5 = 1
            r3.mo13248bindText(r5, r4)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r3.step()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            if (r4 == 0) goto L1c
            long r1 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L21
            int r4 = (int) r1
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r5 = r0
        L1d:
            r3.close()
            return r5
        L21:
            r4 = move-exception
            r3.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDao_Impl.isWorkSpecScheduled$lambda$0(java.lang.String, java.lang.String, androidx.sqlite.SQLiteConnection):boolean");
    }

    static final int markWorkSpecScheduled$lambda$0(String str, long j2, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, j2);
            sQLiteStatementPrepare.mo13248bindText(2, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final int resetScheduledState$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab resetWorkSpecNextScheduleTimeOverride$lambda$0(String str, String str2, int i2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.mo13246bindLong(2, i2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final int resetWorkSpecRunAttemptCount$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final int setCancelledState$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab setLastEnqueueTime$lambda$0(String str, long j2, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, j2);
            sQLiteStatementPrepare.mo13248bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final ab setNextScheduleTimeOverride$lambda$0(String str, long j2, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, j2);
            sQLiteStatementPrepare.mo13248bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final ab setOutput$lambda$0(String str, Data data, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13244bindBlob(1, Data.Companion.toByteArrayInternalV1(data));
            sQLiteStatementPrepare.mo13248bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final int setState$lambda$0(String str, WorkInfo.State state, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, WorkTypeConverters.stateToInt(state));
            sQLiteStatementPrepare.mo13248bindText(2, str2);
            sQLiteStatementPrepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab setStopReason$lambda$0(String str, int i2, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13246bindLong(1, i2);
            sQLiteStatementPrepare.mo13248bindText(2, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final ab updateWorkSpec$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "_connection");
        workSpecDao_Impl.__updateAdapterOfWorkSpec.handle(sQLiteConnection, workSpec);
        return ab.f48028a;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda12
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(WorkSpecDao_Impl.countNonFinishedContentUriTriggerWorkers$lambda$0(str, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "DELETE FROM workspec WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda14
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.delete$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(final int i2) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda17
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getAllEligibleWorkSpecsForScheduling$lambda$0(str, i2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllUnblockedWork() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND LENGTH(content_uri_triggers)=0 ORDER BY last_enqueue_time";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda25
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getAllUnblockedWork$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getAllUnfinishedWork$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        final String str = "SELECT id FROM workspec";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda32
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getAllWorkSpecIds$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        final String str = "SELECT id FROM workspec";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda34
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getAllWorkSpecIdsLiveData$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(final int i2) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda30
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getEligibleWorkForScheduling$lambda$0(str, i2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getEligibleWorkForSchedulingWithContentUris$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda33
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getInputsFromPrerequisites$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(final long j2) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda28
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getRecentlyCompletedWork$lambda$0(str, j2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda43
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getRunningWork$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<Long> getScheduleRequestedAtLiveData(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT schedule_requested_at FROM workspec WHERE id=?";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda9
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getScheduleRequestedAtLiveData$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda29
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getScheduledWork$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWorkWithContentUris() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda11
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getScheduledWorkWithContentUris$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT state FROM workspec WHERE id=?";
        return (WorkInfo.State) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getState$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(final String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        final String str2 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda21
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getUnfinishedWorkWithName$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(final String str) {
        x.f(str, "tag");
        final String str2 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda40
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getUnfinishedWorkWithTag$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT * FROM workspec WHERE id=?";
        return (WorkSpec) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkSpec$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(final String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        final String str2 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda19
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkSpecIdAndStatesForName$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public k<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowDataForIds(final List<String> list) {
        x.f(list, "ids");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        x.e(string, "toString(...)");
        l lVar = new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda22
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoFlowDataForIds$lambda$0(string, list, this, (SQLiteConnection) obj);
            }
        };
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, lVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public k<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForName(final String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        final String str2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        l lVar = new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda46
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoFlowForName$lambda$0(str2, str, this, (SQLiteConnection) obj);
            }
        };
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, lVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public k<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForTag(final String str) {
        x.f(str, "tag");
        final String str2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        l lVar = new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda20
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoFlowForTag$lambda$0(str2, str, this, (SQLiteConnection) obj);
            }
        };
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, lVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id=?";
        return (WorkSpec.WorkInfoPojo) DBUtil.performBlocking(this.__db, true, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda48
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoForId$lambda$0(str2, str, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(final List<String> list) {
        x.f(list, "ids");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        x.e(string, "toString(...)");
        return (List) DBUtil.performBlocking(this.__db, true, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoForIds$lambda$0(string, list, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(final String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        final String str2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) DBUtil.performBlocking(this.__db, true, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda45
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoForName$lambda$0(str2, str, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(final String str) {
        x.f(str, "tag");
        final String str2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) DBUtil.performBlocking(this.__db, true, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda23
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoForTag$lambda$0(str2, str, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(final List<String> list) {
        x.f(list, "ids");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final String string = sb.toString();
        x.e(string, "toString(...)");
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda39
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoLiveDataForIds$lambda$0(string, list, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(final String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        final String str2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoLiveDataForName$lambda$0(str2, str, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(final String str) {
        x.f(str, "tag");
        final String str2 = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda49
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.getWorkStatusPojoLiveDataForTag$lambda$0(str2, str, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public k<Boolean> hasUnfinishedWorkFlow() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        l lVar = new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda16
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(WorkSpecDao_Impl.hasUnfinishedWorkFlow$lambda$0(str, (SQLiteConnection) obj));
            }
        };
        return FlowUtil.createFlow(this.__db, false, new String[]{"workspec"}, lVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET generation=generation+1 WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda36
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.incrementGeneration$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda27
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.incrementPeriodCount$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda41
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(WorkSpecDao_Impl.incrementWorkSpecRunAttemptCount$lambda$0(str2, str, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(final WorkSpec workSpec) {
        x.f(workSpec, "workSpec");
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.insertWorkSpec$lambda$0(this.f$0, workSpec, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean isWorkSpecScheduled(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1";
        return ((Boolean) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda38
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(WorkSpecDao_Impl.isWorkSpecScheduled$lambda$0(str2, str, (SQLiteConnection) obj));
            }
        })).booleanValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(final String str, final long j2) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda35
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(WorkSpecDao_Impl.markWorkSpecScheduled$lambda$0(str2, j2, str, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        final String str = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda15
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda18
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(WorkSpecDao_Impl.resetScheduledState$lambda$0(str, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(final String str, final int i2) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda13
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride$lambda$0(str2, str, i2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda26
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(WorkSpecDao_Impl.resetWorkSpecRunAttemptCount$lambda$0(str2, str, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda37
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(WorkSpecDao_Impl.setCancelledState$lambda$0(str2, str, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(final String str, final long j2) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.setLastEnqueueTime$lambda$0(str2, j2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(final String str, final long j2) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda31
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.setNextScheduleTimeOverride$lambda$0(str2, j2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(final String str, final Data data) {
        x.f(str, TtmlNode.ATTR_ID);
        x.f(data, "output");
        final String str2 = "UPDATE workspec SET output=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.setOutput$lambda$0(str2, data, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(final WorkInfo.State state, final String str) {
        x.f(state, "state");
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda47
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(WorkSpecDao_Impl.setState$lambda$0(str2, state, str, (SQLiteConnection) obj));
            }
        })).intValue();
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(final String str, final int i2) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "UPDATE workspec SET stop_reason=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda10
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.setStopReason$lambda$0(str2, i2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(final WorkSpec workSpec) {
        x.f(workSpec, "workSpec");
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda24
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkSpecDao_Impl.updateWorkSpec$lambda$0(this.f$0, workSpec, (SQLiteConnection) obj);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final List<c<?>> getRequiredConverters() {
            return i.h();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
