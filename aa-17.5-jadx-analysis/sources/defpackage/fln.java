package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class fln extends ezf {
    final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fln(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.ezf
    public final void a(fca fcaVar) {
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dan.j(fcaVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        dan.j(fcaVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        dan.j(fcaVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        dan.j(fcaVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dan.j(fcaVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dan.j(fcaVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dan.j(fcaVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.ezf
    public final void b(fca fcaVar) {
        dan.j(fcaVar, "DROP TABLE IF EXISTS `Dependency`");
        dan.j(fcaVar, "DROP TABLE IF EXISTS `WorkSpec`");
        dan.j(fcaVar, "DROP TABLE IF EXISTS `WorkTag`");
        dan.j(fcaVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
        dan.j(fcaVar, "DROP TABLE IF EXISTS `WorkName`");
        dan.j(fcaVar, "DROP TABLE IF EXISTS `WorkProgress`");
        dan.j(fcaVar, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.ezf
    public final void c(fca fcaVar) throws Exception {
        dan.j(fcaVar, "PRAGMA foreign_keys = ON");
        eys eysVarB = this.d.b();
        ezv ezvVar = eysVarB.b;
        fbk fbkVarA = fcaVar.a("PRAGMA query_only");
        try {
            fbkVarA.k();
            boolean zM = fbkVarA.m();
            affa.m(fbkVarA, null);
            if (!zM) {
                dan.j(fcaVar, "PRAGMA temp_store = MEMORY");
                dan.j(fcaVar, "PRAGMA recursive_triggers = 1");
                dan.j(fcaVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ezvVar.c) {
                    dan.j(fcaVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    dan.j(fcaVar, afyh.J("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                eyv eyvVar = ezvVar.e;
                ReentrantLock reentrantLock = eyvVar.a;
                reentrantLock.lock();
                try {
                    eyvVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (eysVarB.h) {
                ecx ecxVar = eysVarB.i;
            }
        } finally {
        }
    }

    @Override // defpackage.ezf
    public final void d(fca fcaVar) throws Exception {
        afbt afbtVar = new afbt(10);
        fbk fbkVarA = fcaVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (fbkVarA.k()) {
            try {
                afbtVar.add(fbkVarA.d(0));
            } finally {
            }
        }
        affa.m(fbkVarA, null);
        ListIterator listIterator = ((afbt) afbtVar.f()).listIterator(0);
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (afyh.g(str, "room_fts_content_sync_", false)) {
                dan.j(fcaVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }

    @Override // defpackage.ezf
    public final admq g(fca fcaVar) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new fav("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new fav("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new faw("WorkSpec", "CASCADE", "CASCADE", woy.bg("work_spec_id"), woy.bg("id")));
        linkedHashSet.add(new faw("WorkSpec", "CASCADE", "CASCADE", woy.bg("prerequisite_id"), woy.bg("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new fax("index_Dependency_work_spec_id", false, woy.bg("work_spec_id"), woy.bg("ASC")));
        linkedHashSet2.add(new fax("index_Dependency_prerequisite_id", false, woy.bg("prerequisite_id"), woy.bg("ASC")));
        fay fayVar = new fay("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        fay fayVarQ = crt.q(fcaVar, "Dependency");
        if (!crt.p(fayVar, fayVarQ)) {
            return new admq(false, a.bt(fayVarQ, fayVar, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new fav("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new fav("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new fav("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input_merger_class_name", new fav("input_merger_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new fav("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new fav("output", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new fav("initial_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new fav("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new fav("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new fav("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new fav("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new fav("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new fav("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new fav("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new fav("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new fav("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new fav("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("period_count", new fav("period_count", "INTEGER", true, 0, CloudRecognizerProtocolStrings.DBG_VALUE, 1));
        linkedHashMap2.put("generation", new fav("generation", "INTEGER", true, 0, CloudRecognizerProtocolStrings.DBG_VALUE, 1));
        linkedHashMap2.put("next_schedule_time_override", new fav("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new fav("next_schedule_time_override_generation", "INTEGER", true, 0, CloudRecognizerProtocolStrings.DBG_VALUE, 1));
        linkedHashMap2.put("stop_reason", new fav("stop_reason", "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new fav("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new fav("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new fav("required_network_type", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new fav("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new fav("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new fav("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new fav("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new fav("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new fav("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new fav("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new fav("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new fax("index_WorkSpec_schedule_requested_at", false, woy.bg("schedule_requested_at"), woy.bg("ASC")));
        linkedHashSet4.add(new fax("index_WorkSpec_last_enqueue_time", false, woy.bg("last_enqueue_time"), woy.bg("ASC")));
        fay fayVar2 = new fay("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        fay fayVarQ2 = crt.q(fcaVar, "WorkSpec");
        if (!crt.p(fayVar2, fayVarQ2)) {
            return new admq(false, a.bt(fayVarQ2, fayVar2, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new fav("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new fav("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new faw("WorkSpec", "CASCADE", "CASCADE", woy.bg("work_spec_id"), woy.bg("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new fax("index_WorkTag_work_spec_id", false, woy.bg("work_spec_id"), woy.bg("ASC")));
        fay fayVar3 = new fay("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        fay fayVarQ3 = crt.q(fcaVar, "WorkTag");
        if (!crt.p(fayVar3, fayVarQ3)) {
            return new admq(false, a.bt(fayVarQ3, fayVar3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new fav("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new fav("generation", "INTEGER", true, 2, CloudRecognizerProtocolStrings.DBG_VALUE, 1));
        linkedHashMap4.put("system_id", new fav("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new faw("WorkSpec", "CASCADE", "CASCADE", woy.bg("work_spec_id"), woy.bg("id")));
        fay fayVar4 = new fay("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        fay fayVarQ4 = crt.q(fcaVar, "SystemIdInfo");
        if (!crt.p(fayVar4, fayVarQ4)) {
            return new admq(false, a.bt(fayVarQ4, fayVar4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new fav("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new fav("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new faw("WorkSpec", "CASCADE", "CASCADE", woy.bg("work_spec_id"), woy.bg("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new fax("index_WorkName_work_spec_id", false, woy.bg("work_spec_id"), woy.bg("ASC")));
        fay fayVar5 = new fay("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        fay fayVarQ5 = crt.q(fcaVar, "WorkName");
        if (!crt.p(fayVar5, fayVarQ5)) {
            return new admq(false, a.bt(fayVarQ5, fayVar5, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new fav("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new fav("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new faw("WorkSpec", "CASCADE", "CASCADE", woy.bg("work_spec_id"), woy.bg("id")));
        fay fayVar6 = new fay("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        fay fayVarQ6 = crt.q(fcaVar, "WorkProgress");
        if (!crt.p(fayVar6, fayVarQ6)) {
            return new admq(false, a.bt(fayVarQ6, fayVar6, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", "\n Found:\n"));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new fav("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new fav("long_value", "INTEGER", false, 0, null, 1));
        fay fayVar7 = new fay("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        fay fayVarQ7 = crt.q(fcaVar, "Preference");
        return !crt.p(fayVar7, fayVarQ7) ? new admq(false, a.bt(fayVarQ7, fayVar7, "Preference(androidx.work.impl.model.Preference).\n Expected:\n", "\n Found:\n")) : new admq(true, (String) null);
    }

    @Override // defpackage.ezf
    public final void e() {
    }

    @Override // defpackage.ezf
    public final void f() {
    }
}
