.class public final Lea/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lea/v;


# static fields
.field public static final e:Lea/y;

.field public static final f:Lw1/b;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljf/h;

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public final d:LHf/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lea/y;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/D;->e:Lea/y;

    .line 7
    .line 8
    sget-object v0, Lea/u;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, Lac/a;

    .line 11
    .line 12
    sget-object v2, Lea/x;->i:Lea/x;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lac/a;-><init>(Ltf/l;)V

    .line 15
    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Ltg/b;->M(Ljava/lang/String;Lac/a;I)Lw1/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lea/D;->f:Lw1/b;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljf/h;)V
    .locals 4

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lea/D;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lea/D;->b:Ljf/h;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lea/D;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    sget-object v0, Lea/D;->e:Lea/y;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lea/y;->a:[Lkotlin/reflect/KProperty;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    aget-object v0, v0, v1

    .line 29
    .line 30
    sget-object v1, Lea/D;->f:Lw1/b;

    .line 31
    .line 32
    invoke-virtual {v1, p1, v0}, Lw1/b;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lu1/i;

    .line 37
    .line 38
    invoke-interface {p1}, Lu1/i;->getData()LHf/l;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, LCd/p;

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x4

    .line 47
    invoke-direct {v0, v1, v2, v3}, LCd/p;-><init>(ILjf/c;I)V

    .line 48
    .line 49
    .line 50
    new-instance v3, LHf/v;

    .line 51
    .line 52
    invoke-direct {v3, p1, v0}, LHf/v;-><init>(LHf/l;Ltf/q;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, LHf/Z;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-direct {p1, v3, p0, v0}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lea/D;->d:LHf/Z;

    .line 62
    .line 63
    invoke-static {p2}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, Lea/w;

    .line 68
    .line 69
    invoke-direct {p2, p0, v2}, Lea/w;-><init>(Lea/D;Ljf/c;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v2, p2, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 73
    .line 74
    .line 75
    return-void
.end method
