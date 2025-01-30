- Como diabos fazer funcionar o Artists(Missões)
- Após algumas pesquisas eu tentei colocar o (fetch = FetchType.EAGER)
No ArtistModel(MissõesModel) e de fato funcionou, mas o ListArtists(ListMissions)
está saindo de uma forma estranha, já que está listando os Artistas toda hora.
### [
  {
  "id": 1,
  "name": "Kaiser Chiefs",
  "musicalGenre": "ROCK",
  "songs": [
  {
  "id": 1,
  "title": "Ruby",
  "artist": {
  "id": 1,
  "name": "Kaiser Chiefs",
  "musicalGenre": "ROCK",
  "nationality": "United States",
  "imgUrl": "http://example.com/img1.jpg"
  },
  "album": "Employment",
  "releaseYear": "2007-04-16"
  },
  {
  "id": 33,
  "title": "I Predict a Riot",
  "artist": {
  "id": 1,
  "name": "Kaiser Chiefs",
  "musicalGenre": "ROCK",
  "nationality": "United States",
  "imgUrl": "http://example.com/img1.jpg"
  },
  "album": "Employment",
  "releaseYear": "2005-06-06"
  }
  ],
  "nationality": "United States",
  "imgUrl": "http://example.com/img1.jpg"
  }
 ### ]

Pensei em deixar assim e tentar arrumar com o front end mas não se se vai ser possivl, 

Algumas das outras soluções que pensei foram, Fazer mais dtos, para as que vão ser enviadas nas requisições e as que
vao ser respondidas, porque ai eu poderia tentar ir fazendo todos esses mapeamentos até sair de uma forma especícia 
