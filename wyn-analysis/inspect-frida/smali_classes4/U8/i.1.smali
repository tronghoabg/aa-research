.class public final LU8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh9/e;


# static fields
.field public static final a:LU8/i;

.field public static final b:Lh9/d;

.field public static final c:Lh9/d;

.field public static final d:Lh9/d;

.field public static final e:Lh9/d;

.field public static final f:Lh9/d;

.field public static final g:Lh9/d;

.field public static final h:Lh9/d;

.field public static final i:Lh9/d;

.field public static final j:Lh9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU8/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU8/i;->a:LU8/i;

    .line 7
    .line 8
    const-string v0, "arch"

    .line 9
    .line 10
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LU8/i;->b:Lh9/d;

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
    sput-object v0, LU8/i;->c:Lh9/d;

    .line 23
    .line 24
    const-string v0, "cores"

    .line 25
    .line 26
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, LU8/i;->d:Lh9/d;

    .line 31
    .line 32
    const-string v0, "ram"

    .line 33
    .line 34
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LU8/i;->e:Lh9/d;

    .line 39
    .line 40
    const-string v0, "diskSpace"

    .line 41
    .line 42
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, LU8/i;->f:Lh9/d;

    .line 47
    .line 48
    const-string v0, "simulator"

    .line 49
    .line 50
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, LU8/i;->g:Lh9/d;

    .line 55
    .line 56
    const-string v0, "state"

    .line 57
    .line 58
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, LU8/i;->h:Lh9/d;

    .line 63
    .line 64
    const-string v0, "manufacturer"

    .line 65
    .line 66
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, LU8/i;->i:Lh9/d;

    .line 71
    .line 72
    const-string v0, "modelClass"

    .line 73
    .line 74
    invoke-static {v0}, Lh9/d;->c(Ljava/lang/String;)Lh9/d;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, LU8/i;->j:Lh9/d;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, LU8/x0;

    .line 2
    .line 3
    check-cast p2, Lh9/f;

    .line 4
    .line 5
    check-cast p1, LU8/O;

    .line 6
    .line 7
    iget v0, p1, LU8/O;->a:I

    .line 8
    .line 9
    sget-object v1, LU8/i;->b:Lh9/d;

    .line 10
    .line 11
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;I)Lh9/f;

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LU8/O;->b:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v1, LU8/i;->c:Lh9/d;

    .line 17
    .line 18
    invoke-interface {p2, v1, v0}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 19
    .line 20
    .line 21
    sget-object v0, LU8/i;->d:Lh9/d;

    .line 22
    .line 23
    iget v1, p1, LU8/O;->c:I

    .line 24
    .line 25
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;I)Lh9/f;

    .line 26
    .line 27
    .line 28
    sget-object v0, LU8/i;->e:Lh9/d;

    .line 29
    .line 30
    iget-wide v1, p1, LU8/O;->d:J

    .line 31
    .line 32
    invoke-interface {p2, v0, v1, v2}, Lh9/f;->add(Lh9/d;J)Lh9/f;

    .line 33
    .line 34
    .line 35
    sget-object v0, LU8/i;->f:Lh9/d;

    .line 36
    .line 37
    iget-wide v1, p1, LU8/O;->e:J

    .line 38
    .line 39
    invoke-interface {p2, v0, v1, v2}, Lh9/f;->add(Lh9/d;J)Lh9/f;

    .line 40
    .line 41
    .line 42
    sget-object v0, LU8/i;->g:Lh9/d;

    .line 43
    .line 44
    iget-boolean v1, p1, LU8/O;->f:Z

    .line 45
    .line 46
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Z)Lh9/f;

    .line 47
    .line 48
    .line 49
    sget-object v0, LU8/i;->h:Lh9/d;

    .line 50
    .line 51
    iget v1, p1, LU8/O;->g:I

    .line 52
    .line 53
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;I)Lh9/f;

    .line 54
    .line 55
    .line 56
    sget-object v0, LU8/i;->i:Lh9/d;

    .line 57
    .line 58
    iget-object v1, p1, LU8/O;->h:Ljava/lang/String;

    .line 59
    .line 60
    invoke-interface {p2, v0, v1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 61
    .line 62
    .line 63
    sget-object v0, LU8/i;->j:Lh9/d;

    .line 64
    .line 65
    iget-object p1, p1, LU8/O;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {p2, v0, p1}, Lh9/f;->add(Lh9/d;Ljava/lang/Object;)Lh9/f;

    .line 68
    .line 69
    .line 70
    return-void
.end method
