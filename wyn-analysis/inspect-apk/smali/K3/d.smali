.class public final LK3/d;
.super Ll3/a;
.source "SourceFile"


# static fields
.field public static final d:LK3/d;

.field public static final e:LK3/d;

.field public static final f:LK3/d;

.field public static final g:LK3/d;

.field public static final h:LK3/d;

.field public static final i:LK3/d;

.field public static final j:LK3/d;

.field public static final k:LK3/d;

.field public static final l:LK3/d;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LK3/d;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LK3/d;->d:LK3/d;

    .line 12
    .line 13
    new-instance v0, LK3/d;

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    const/16 v2, 0xd

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LK3/d;->e:LK3/d;

    .line 24
    .line 25
    new-instance v0, LK3/d;

    .line 26
    .line 27
    const/16 v1, 0xf

    .line 28
    .line 29
    const/16 v2, 0x10

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LK3/d;->f:LK3/d;

    .line 36
    .line 37
    new-instance v0, LK3/d;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    const/4 v2, 0x2

    .line 41
    const/4 v3, 0x3

    .line 42
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 43
    .line 44
    .line 45
    sput-object v0, LK3/d;->g:LK3/d;

    .line 46
    .line 47
    new-instance v0, LK3/d;

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    const/4 v2, 0x4

    .line 51
    const/4 v3, 0x4

    .line 52
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LK3/d;->h:LK3/d;

    .line 56
    .line 57
    new-instance v0, LK3/d;

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    const/4 v2, 0x5

    .line 61
    const/4 v3, 0x5

    .line 62
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 63
    .line 64
    .line 65
    sput-object v0, LK3/d;->i:LK3/d;

    .line 66
    .line 67
    new-instance v0, LK3/d;

    .line 68
    .line 69
    const/4 v1, 0x6

    .line 70
    const/4 v2, 0x7

    .line 71
    const/4 v3, 0x6

    .line 72
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 73
    .line 74
    .line 75
    sput-object v0, LK3/d;->j:LK3/d;

    .line 76
    .line 77
    new-instance v0, LK3/d;

    .line 78
    .line 79
    const/4 v1, 0x7

    .line 80
    const/16 v2, 0x8

    .line 81
    .line 82
    const/4 v3, 0x7

    .line 83
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 84
    .line 85
    .line 86
    sput-object v0, LK3/d;->k:LK3/d;

    .line 87
    .line 88
    new-instance v0, LK3/d;

    .line 89
    .line 90
    const/16 v1, 0x8

    .line 91
    .line 92
    const/16 v2, 0x9

    .line 93
    .line 94
    const/16 v3, 0x8

    .line 95
    .line 96
    invoke-direct {v0, v1, v2, v3}, LK3/d;-><init>(III)V

    .line 97
    .line 98
    .line 99
    sput-object v0, LK3/d;->l:LK3/d;

    .line 100
    .line 101
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xa

    iput v0, p0, LK3/d;->c:I

    const/16 v0, 0xe

    const/16 v1, 0xf

    .line 2
    invoke-direct {p0, v0, v1}, Ll3/a;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, LK3/d;->c:I

    invoke-direct {p0, p1, p2}, Ll3/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lo3/a;)V
    .locals 3

    .line 1
    iget v0, p0, LK3/d;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "DROP TABLE `WorkSpec`"

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"

    .line 32
    .line 33
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0"

    .line 37
    .line 38
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Landroid/content/ContentValues;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const-string v2, "last_enqueue_time"

    .line 56
    .line 57
    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    new-array v1, v1, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-interface {p1, v0, v1}, Lo3/a;->U(Landroid/content/ContentValues;[Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_0
    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    .line 68
    .line 69
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v0, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"

    .line 73
    .line 74
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "DROP TABLE `WorkSpec`"

    .line 78
    .line 79
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string v0, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"

    .line 83
    .line 84
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    .line 88
    .line 89
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)"

    .line 93
    .line 94
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_1
    const-string v0, "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0"

    .line 99
    .line 100
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_2
    const-string v0, "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    "

    .line 105
    .line 106
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_3
    const-string v0, "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    "

    .line 111
    .line 112
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_4
    const-string v0, "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1"

    .line 117
    .line 118
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const-string v0, "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1"

    .line 122
    .line 123
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_5
    const-string v0, "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    "

    .line 128
    .line 129
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_6
    const-string v0, "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    "

    .line 134
    .line 135
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string v0, "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    "

    .line 139
    .line 140
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v0, "DROP TABLE IF EXISTS alarmInfo"

    .line 144
    .line 145
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string v0, "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                "

    .line 149
    .line 150
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_7
    const-string v0, "DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)"

    .line 155
    .line 156
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string v0, "ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0"

    .line 160
    .line 161
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )"

    .line 165
    .line 166
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`"

    .line 170
    .line 171
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    const-string v0, "DROP TABLE `SystemIdInfo`"

    .line 175
    .line 176
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    const-string v0, "ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`"

    .line 180
    .line 181
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_8
    const-string v0, "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL "

    .line 186
    .line 187
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const-string v0, "UPDATE workspec SET content_uri_triggers = x\'\' WHERE content_uri_triggers is NULL"

    .line 191
    .line 192
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_9
    const-string v0, "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0"

    .line 197
    .line 198
    invoke-interface {p1, v0}, Lo3/a;->f(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
