.class public abstract Lz/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS3/e;

.field public static final b:LN/Y;

.field public static final c:LA/F;

.field public static final d:LA/F;

.field public static final e:LA/F;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lz/b;->l:Lz/b;

    .line 2
    .line 3
    sget-object v1, Lz/b;->m:Lz/b;

    .line 4
    .line 5
    sget-object v2, LA/b0;->a:LS3/e;

    .line 6
    .line 7
    new-instance v2, LS3/e;

    .line 8
    .line 9
    invoke-direct {v2, v0, v1}, LS3/e;-><init>(Ltf/l;Ltf/l;)V

    .line 10
    .line 11
    .line 12
    sput-object v2, Lz/i;->a:LS3/e;

    .line 13
    .line 14
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, LN/P;->f:LN/P;

    .line 21
    .line 22
    invoke-static {v0, v1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lz/i;->b:LN/Y;

    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {v0, v1}, LA/t;->i(ILjava/lang/Object;)LA/F;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lz/i;->c:LA/F;

    .line 35
    .line 36
    sget v0, LL0/g;->c:I

    .line 37
    .line 38
    sget-object v0, LA/f0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-static {v0, v0}, LA6/h;->b(II)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    new-instance v3, LL0/g;

    .line 46
    .line 47
    invoke-direct {v3, v1, v2}, LL0/g;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v3}, LA/t;->i(ILjava/lang/Object;)LA/F;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sput-object v1, Lz/i;->d:LA/F;

    .line 55
    .line 56
    invoke-static {v0, v0}, LBa/c;->a(II)J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    new-instance v3, LL0/h;

    .line 61
    .line 62
    invoke-direct {v3, v1, v2}, LL0/h;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v3}, LA/t;->i(ILjava/lang/Object;)LA/F;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lz/i;->e:LA/F;

    .line 70
    .line 71
    return-void
.end method
