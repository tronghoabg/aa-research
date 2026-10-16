.class public final Lcom/moloco/sdk/acm/eventprocessing/g;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LC6/l;

.field public b:LNf/d;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:LC6/l;

.field public e:I


# direct methods
.method public constructor <init>(LC6/l;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/acm/eventprocessing/g;->d:LC6/l;

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

    iput-object p1, p0, Lcom/moloco/sdk/acm/eventprocessing/g;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/moloco/sdk/acm/eventprocessing/g;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/moloco/sdk/acm/eventprocessing/g;->e:I

    iget-object p1, p0, Lcom/moloco/sdk/acm/eventprocessing/g;->d:LC6/l;

    invoke-virtual {p1, p0}, LC6/l;->h(Llf/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
