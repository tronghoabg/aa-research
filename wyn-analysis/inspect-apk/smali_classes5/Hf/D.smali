.class public final LHf/D;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public synthetic b:Ljava/lang/Object;

.field public c:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LHf/D;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LHf/D;->c:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LHf/D;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p1, p0}, LHf/k0;->d(LHf/m;Ljava/lang/Object;Ljava/lang/Object;Llf/c;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 15
    .line 16
    return-object p1
.end method
