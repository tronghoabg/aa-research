.class public final Ls5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:Ls5/b;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;

.field public static final d:Lh9/d;

.field public static final e:Lh9/d;

.field public static final f:Lh9/d;

.field public static final g:Lh9/d;

.field public static final h:Lh9/d;

.field public static final i:Lh9/d;

.field public static final j:Lh9/d;

.field public static final k:Lh9/d;

.field public static final l:Lh9/d;

.field public static final m:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls5/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls5/b;->a:Ls5/b;

    .line 7
    .line 8
    const-string v0, "sdkVersion"

    .line 9
    .line 10
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ls5/b;->b:Lh9/d;

    .line 15
    .line 16
    const-string v0, "model"

    .line 17
    .line 18
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Ls5/b;->c:Lh9/d;

    .line 23
    .line 24
    const-string v0, "hardware"

    .line 25
    .line 26
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Ls5/b;->d:Lh9/d;

    .line 31
    .line 32
    const-string v0, "device"

    .line 33
    .line 34
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Ls5/b;->e:Lh9/d;

    .line 39
    .line 40
    const-string v0, "product"

    .line 41
    .line 42
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Ls5/b;->f:Lh9/d;

    .line 47
    .line 48
    const-string v0, "osBuild"

    .line 49
    .line 50
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Ls5/b;->g:Lh9/d;

    .line 55
    .line 56
    const-string v0, "manufacturer"

    .line 57
    .line 58
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Ls5/b;->h:Lh9/d;

    .line 63
    .line 64
    const-string v0, "fingerprint"

    .line 65
    .line 66
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, Ls5/b;->i:Lh9/d;

    .line 71
    .line 72
    const-string v0, "locale"

    .line 73
    .line 74
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Ls5/b;->j:Lh9/d;

    .line 79
    .line 80
    const-string v0, "country"

    .line 81
    .line 82
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, Ls5/b;->k:Lh9/d;

    .line 87
    .line 88
    const-string v0, "mccMnc"

    .line 89
    .line 90
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sput-object v0, Ls5/b;->l:Lh9/d;

    .line 95
    .line 96
    const-string v0, "applicationBuild"

    .line 97
    .line 98
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sput-object v0, Ls5/b;->m:Lh9/d;

    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ls5/a;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    check-cast p1, Ls5/m;

    .line 6
    .line 7
    iget-object v0, p1, Ls5/m;->a:Ljava/lang/Integer;

    .line 8
    .line 9
    sget-object v1, Ls5/b;->b:Lh9/d;

    .line 10
    .line 11
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, Ls5/m;->b:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v1, Ls5/b;->c:Lh9/d;

    .line 17
    .line 18
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Ls5/m;->c:Ljava/lang/String;

    .line 22
    .line 23
    sget-object v1, Ls5/b;->d:Lh9/d;

    .line 24
    .line 25
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 26
    .line 27
    .line 28
    iget-object v0, p1, Ls5/m;->d:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v1, Ls5/b;->e:Lh9/d;

    .line 31
    .line 32
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 33
    .line 34
    .line 35
    iget-object v0, p1, Ls5/m;->e:Ljava/lang/String;

    .line 36
    .line 37
    sget-object v1, Ls5/b;->f:Lh9/d;

    .line 38
    .line 39
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 40
    .line 41
    .line 42
    iget-object v0, p1, Ls5/m;->f:Ljava/lang/String;

    .line 43
    .line 44
    sget-object v1, Ls5/b;->g:Lh9/d;

    .line 45
    .line 46
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 47
    .line 48
    .line 49
    iget-object v0, p1, Ls5/m;->g:Ljava/lang/String;

    .line 50
    .line 51
    sget-object v1, Ls5/b;->h:Lh9/d;

    .line 52
    .line 53
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 54
    .line 55
    .line 56
    iget-object v0, p1, Ls5/m;->h:Ljava/lang/String;

    .line 57
    .line 58
    sget-object v1, Ls5/b;->i:Lh9/d;

    .line 59
    .line 60
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 61
    .line 62
    .line 63
    iget-object v0, p1, Ls5/m;->i:Ljava/lang/String;

    .line 64
    .line 65
    sget-object v1, Ls5/b;->j:Lh9/d;

    .line 66
    .line 67
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 68
    .line 69
    .line 70
    iget-object v0, p1, Ls5/m;->j:Ljava/lang/String;

    .line 71
    .line 72
    sget-object v1, Ls5/b;->k:Lh9/d;

    .line 73
    .line 74
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 75
    .line 76
    .line 77
    iget-object v0, p1, Ls5/m;->k:Ljava/lang/String;

    .line 78
    .line 79
    sget-object v1, Ls5/b;->l:Lh9/d;

    .line 80
    .line 81
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 82
    .line 83
    .line 84
    iget-object p1, p1, Ls5/m;->l:Ljava/lang/String;

    .line 85
    .line 86
    sget-object v0, Ls5/b;->m:Lh9/d;

    .line 87
    .line 88
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 89
    .line 90
    .line 91
    return-void
.end method
