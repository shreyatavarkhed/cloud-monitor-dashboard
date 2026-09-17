# Cloud Service Monitoring Dashboard — Backend

Spring Boot 3 backend for a full-stack cloud service monitoring dashboard. Tracks real-time UP/DOWN health status across 8 microservices with per-service failure isolation.

> **React frontend:** [cloud-monitor-react](https://github.com/shreyatavarkhed/cloud-monitor-react)

---

## Features

- Real-time health monitoring with UP/DOWN status per microservice
- Per-service error isolation — one failing service does not break the dashboard
- REST API for adding, toggling, and deleting monitored services
- Persistent storage via Spring Data JPA + H2 (state survives restarts)
- Validated add-service endpoint

## Tech Stack

- **Backend:** Java 17, Spring Boot 3, Spring Data JPA, H2, Maven
- **API:** RESTful endpoints returning JSON
- **Testing:** JUnit (backend), Vitest + React Testing Library (frontend)

## Architecture

This repo contains the backend only. The dashboard UI is built separately as a React 18 SPA:

| Layer | Repo | Stack |
|---|---|---|
| Backend (this repo) | [cloud-monitor-dashboard](https://github.com/shreyatavarkhed/cloud-monitor-dashboard) | Spring Boot 3, JPA, H2 |
| Frontend | [cloud-monitor-react](https://github.com/shreyatavarkhed/cloud-monitor-react) | React 18, custom `useServices` hook, 4 components, 6 unit tests |

## Running Locally

```bash
./mvnw spring-boot:run
