.class public final LG/d;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Ld0/d;

.field public b:[Ljava/lang/Object;

.field public c:I

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:LG/e;

.field public g:I


# direct methods
.method public constructor <init>(LG/e;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG/d;->f:LG/e;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LG/d;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LG/d;->g:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LG/d;->g:I

    .line 9
    .line 10
    iget-object p1, p0, LG/d;->f:LG/e;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LG/e;->a(Llf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
