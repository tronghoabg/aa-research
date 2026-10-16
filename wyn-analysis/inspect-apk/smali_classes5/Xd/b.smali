.class public abstract LXd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LXd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    const-class v4, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    :try_start_0
    const-string v6, "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"

    .line 9
    .line 10
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    move-object v7, v5

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v6

    .line 17
    move-object v7, v6

    .line 18
    move-object v6, v5

    .line 19
    :goto_0
    if-eqz v6, :cond_0

    .line 20
    .line 21
    :try_start_1
    const-class v8, LXd/a;

    .line 22
    .line 23
    invoke-virtual {v6, v8}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    new-array v8, v3, [Ljava/lang/Class;

    .line 28
    .line 29
    const-class v9, LXd/c;

    .line 30
    .line 31
    aput-object v9, v8, v2

    .line 32
    .line 33
    invoke-virtual {v6, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    new-array v8, v3, [Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v9, LXd/a;->a:LXd/c;

    .line 40
    .line 41
    aput-object v9, v8, v2

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, LXd/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_1
    move-exception v6

    .line 51
    move-object v7, v6

    .line 52
    :cond_0
    move-object v6, v5

    .line 53
    :goto_1
    if-eqz v6, :cond_1

    .line 54
    .line 55
    sput-object v6, LXd/b;->a:LXd/a;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    new-instance v6, LXd/a;

    .line 59
    .line 60
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v6, LXd/b;->a:LXd/a;

    .line 64
    .line 65
    :goto_2
    if-eqz v7, :cond_2

    .line 66
    .line 67
    :try_start_2
    const-string v6, "io.perfmark.PerfMark.debug"

    .line 68
    .line 69
    invoke-static {v6}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    const-string v6, "java.util.logging.Logger"

    .line 76
    .line 77
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const-string v8, "getLogger"

    .line 82
    .line 83
    new-array v9, v3, [Ljava/lang/Class;

    .line 84
    .line 85
    aput-object v4, v9, v2

    .line 86
    .line 87
    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    const-class v9, LXd/b;

    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    new-array v10, v3, [Ljava/lang/Object;

    .line 98
    .line 99
    aput-object v9, v10, v2

    .line 100
    .line 101
    invoke-virtual {v8, v5, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    const-string v9, "java.util.logging.Level"

    .line 106
    .line 107
    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    const-string v10, "FINE"

    .line 112
    .line 113
    invoke-virtual {v9, v10}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-virtual {v10, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const-string v10, "log"

    .line 122
    .line 123
    new-array v11, v1, [Ljava/lang/Class;

    .line 124
    .line 125
    aput-object v9, v11, v2

    .line 126
    .line 127
    aput-object v4, v11, v3

    .line 128
    .line 129
    const-class v4, Ljava/lang/Throwable;

    .line 130
    .line 131
    aput-object v4, v11, v0

    .line 132
    .line 133
    invoke-virtual {v6, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    new-array v1, v1, [Ljava/lang/Object;

    .line 138
    .line 139
    aput-object v5, v1, v2

    .line 140
    .line 141
    const-string v2, "Error during PerfMark.<clinit>"

    .line 142
    .line 143
    aput-object v2, v1, v3

    .line 144
    .line 145
    aput-object v7, v1, v0

    .line 146
    .line 147
    invoke-virtual {v4, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 148
    .line 149
    .line 150
    :catchall_2
    :cond_2
    return-void
.end method

.method public static a()V
    .locals 1

    .line 1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static b()V
    .locals 1

    .line 1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static c()V
    .locals 1

    .line 1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method
