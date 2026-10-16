.class public final LA/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:J

.field public final c:Lkotlin/jvm/internal/n;

.field public final d:LN/Y;

.field public e:LA/n;

.field public f:J

.field public g:J

.field public final h:LN/Y;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LS3/e;LA/n;JLjava/lang/Object;JLtf/a;)V
    .locals 1

    .line 1
    const-string v0, "typeConverter"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "initialVelocityVector"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p6, p0, LA/h;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iput-wide p7, p0, LA/h;->b:J

    .line 17
    .line 18
    check-cast p9, Lkotlin/jvm/internal/n;

    .line 19
    .line 20
    iput-object p9, p0, LA/h;->c:Lkotlin/jvm/internal/n;

    .line 21
    .line 22
    sget-object p2, LN/P;->f:LN/P;

    .line 23
    .line 24
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, LA/h;->d:LN/Y;

    .line 29
    .line 30
    invoke-static {p3}, LA/t;->c(LA/n;)LA/n;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, LA/h;->e:LA/n;

    .line 35
    .line 36
    iput-wide p4, p0, LA/h;->f:J

    .line 37
    .line 38
    const-wide/high16 p3, -0x8000000000000000L

    .line 39
    .line 40
    iput-wide p3, p0, LA/h;->g:J

    .line 41
    .line 42
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, LA/h;->h:LN/Y;

    .line 49
    .line 50
    return-void
.end method
