.class public Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final synthetic d:I


# instance fields
.field public final a:LL8/t;

.field public final b:LL8/t;

.field public final c:LL8/t;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Lfa/d;->a:Lfa/d;

    .line 2
    .line 3
    sget-object v1, Lfa/c;->b:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, "SessionsDependencies"

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "Dependency "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, " already added."

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance v2, Lfa/a;

    .line 37
    .line 38
    new-instance v4, LNf/d;

    .line 39
    .line 40
    const/4 v5, 0x1

    .line 41
    invoke-direct {v4, v5}, LNf/d;-><init>(Z)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v4}, Lfa/a;-><init>(LNf/d;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v2, "Dependency to "

    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, " added."

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LL8/t;

    .line 5
    .line 6
    const-class v1, Ly8/a;

    .line 7
    .line 8
    const-class v2, Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:LL8/t;

    .line 14
    .line 15
    new-instance v0, LL8/t;

    .line 16
    .line 17
    const-class v1, Ly8/b;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:LL8/t;

    .line 23
    .line 24
    new-instance v0, LL8/t;

    .line 25
    .line 26
    const-class v1, Ly8/c;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:LL8/t;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    const-class v3, LN8/c;

    .line 5
    .line 6
    invoke-static {v3}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "fire-cls"

    .line 11
    .line 12
    iput-object v4, v3, LL8/a;->a:Ljava/lang/Object;

    .line 13
    .line 14
    const-class v5, Ls8/g;

    .line 15
    .line 16
    invoke-static {v5}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 21
    .line 22
    .line 23
    const-class v5, LP9/d;

    .line 24
    .line 25
    invoke-static {v5}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 30
    .line 31
    .line 32
    iget-object v5, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a:LL8/t;

    .line 33
    .line 34
    new-instance v6, LL8/l;

    .line 35
    .line 36
    invoke-direct {v6, v5, v2, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v6}, LL8/a;->c(LL8/l;)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->b:LL8/t;

    .line 43
    .line 44
    new-instance v6, LL8/l;

    .line 45
    .line 46
    invoke-direct {v6, v5, v2, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v6}, LL8/a;->c(LL8/l;)V

    .line 50
    .line 51
    .line 52
    iget-object v5, p0, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->c:LL8/t;

    .line 53
    .line 54
    new-instance v6, LL8/l;

    .line 55
    .line 56
    invoke-direct {v6, v5, v2, v1}, LL8/l;-><init>(LL8/t;II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v6}, LL8/a;->c(LL8/l;)V

    .line 60
    .line 61
    .line 62
    const-class v5, LO8/a;

    .line 63
    .line 64
    invoke-static {v5}, LL8/l;->a(Ljava/lang/Class;)LL8/l;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 69
    .line 70
    .line 71
    const-class v5, Lw8/d;

    .line 72
    .line 73
    invoke-static {v5}, LL8/l;->a(Ljava/lang/Class;)LL8/l;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 78
    .line 79
    .line 80
    const-class v5, Lca/a;

    .line 81
    .line 82
    invoke-static {v5}, LL8/l;->a(Ljava/lang/Class;)LL8/l;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 87
    .line 88
    .line 89
    new-instance v5, LB8/b;

    .line 90
    .line 91
    const/16 v6, 0x17

    .line 92
    .line 93
    invoke-direct {v5, p0, v6}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    iput-object v5, v3, LL8/a;->g:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v3, v0}, LL8/a;->f(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3}, LL8/a;->d()LL8/b;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    const-string v5, "19.3.0"

    .line 106
    .line 107
    invoke-static {v4, v5}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    new-array v0, v0, [LL8/b;

    .line 112
    .line 113
    aput-object v3, v0, v1

    .line 114
    .line 115
    aput-object v4, v0, v2

    .line 116
    .line 117
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0
.end method
